/**
 * Service for user registration.
 *
 * Handles input validation, user existence check, and secure registration.
 */
class UserRegistrationService(private val userRepository: UserRepository) {

    /**
     * Registers a new user.
     * @param username The username to register.
     * @param password The password (plain text, will be hashed).
     * @param email The user's email.
     * @return RegistrationResult indicating success or failure.
     */
    fun registerUser(username: String, password: String, email: String): RegistrationResult {
        // Input validation
        if (username.isBlank()) return RegistrationResult.Failure("Username is required")
        if (password.length < 8) return RegistrationResult.Failure("Password must be at least 8 characters")
        if (!email.matches(Regex("^[\\w.-]+@[\\w.-]+\\.\\w+$"))) return RegistrationResult.Failure("Invalid email")

        // Check if user exists
        if (userRepository.existsByUsername(username)) {
            return RegistrationResult.Failure("Username already exists")
        }

        // Hash password
        val hashedPassword = hashPassword(password)

        // Register user
        return try {
            userRepository.save(User(username, hashedPassword, email))
            RegistrationResult.Success
        } catch (e: Exception) {
            RegistrationResult.Failure("Registration failed: ${e.message}")
        }
    }

    private fun hashPassword(password: String): String {
        // Use a secure hash function (e.g., BCrypt)
        return BCrypt.hashpw(password, BCrypt.gensalt())
    }
}

/**
 * Repository interface for user data access.
 */
interface UserRepository {
    fun existsByUsername(username: String): Boolean
    fun save(user: User)
}

/**
 * Data class representing a user.
 */
data class User(val username: String, val passwordHash: String, val email: String)

/**
 * Sealed class for registration result.
 */
sealed class RegistrationResult {
    object Success : RegistrationResult()
    data class Failure(val reason: String) : RegistrationResult()
} 