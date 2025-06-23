package factory

enum class DatabaseType {
    MYSQL,
    POSTGRESQL
}

class ConnectionFactory {
    companion object {
        fun createConnection(type: DatabaseType): Connection {
            return when (type) {
                DatabaseType.MYSQL -> MySqlConnection()
                DatabaseType.POSTGRESQL -> PostgreSqlConnection()
            }
        }
    }
} 