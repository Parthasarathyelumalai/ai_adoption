package factory

class PostgreSqlConnection : Connection {
    override fun connect() {
        println("Connecting to PostgreSQL database...")
    }

    override fun disconnect() {
        println("Disconnecting from PostgreSQL database.")
    }
} 