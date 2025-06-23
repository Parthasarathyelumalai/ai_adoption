package factory

fun main() {
    val mysqlConnection = ConnectionFactory.createConnection(DatabaseType.MYSQL)
    mysqlConnection.connect()
    mysqlConnection.disconnect()

    val postgresqlConnection = ConnectionFactory.createConnection(DatabaseType.POSTGRESQL)
    postgresqlConnection.connect()
    postgresqlConnection.disconnect()
} 