package factory

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ConnectionFactoryTest {

    @Test
    fun `should create mysql connection`() {
        val connection = ConnectionFactory.createConnection(DatabaseType.MYSQL)
        assertTrue(connection is MySqlConnection)
    }

    @Test
    fun `should create postgresql connection`() {
        val connection = ConnectionFactory.createConnection(DatabaseType.POSTGRESQL)
        assertTrue(connection is PostgreSqlConnection)
    }
} 