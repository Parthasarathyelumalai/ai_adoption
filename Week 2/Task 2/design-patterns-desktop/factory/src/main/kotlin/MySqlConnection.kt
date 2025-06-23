package factory

class MySqlConnection : Connection {
    override fun connect() {
        println("Connecting to MySQL database...")
    }

    override fun disconnect() {
        println("Disconnecting from MySQL database.")
    }
} 