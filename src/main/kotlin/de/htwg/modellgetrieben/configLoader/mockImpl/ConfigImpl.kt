package de.htwg.modellgetrieben.configLoader.mockImpl

import de.htwg.modellgetrieben.configLoader.Config
import de.htwg.modellgetrieben.configLoader.server.ServerConfig

class ConfigImpl : Config {
    override fun createServer(name: String): ServerConfig {
        println("Created Server with name: $name")
        return ServerConfigImpl(name)

    }

    override fun loadServerConfig(name: String): ServerConfig {
        return ServerConfigImpl(name)
    }
}
