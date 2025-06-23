import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class InMemoryUserRepository : UserRepository {
    private val users = mutableListOf<User>()
    override fun existsByUsername(username: String): Boolean = users.any { it.username == username }
    override fun save(user: User) { users.add(user) }
}

class UserRegistrationServiceTest {
    private val userRepository = InMemoryUserRepository()
    private val service = UserRegistrationService(userRepository)

    @Test
    fun `should register user successfully`() {
        val result = service.registerUser("testuser", "password123", "test@example.com")
        assertTrue(result is RegistrationResult.Success)
    }

    @Test
    fun `should fail for existing username`() {
        userRepository.save(User("testuser", "hash", "test@example.com"))
        val result = service.registerUser("testuser", "password123", "test2@example.com")
        assertTrue(result is RegistrationResult.Failure)
    }

    @Test
    fun `should fail for invalid email`() {
        val result = service.registerUser("user2", "password123", "invalid-email")
        assertTrue(result is RegistrationResult.Failure)
    }

    @Test
    fun `should fail for short password`() {
        val result = service.registerUser("user3", "short", "user3@example.com")
        assertTrue(result is RegistrationResult.Failure)
    }
} 