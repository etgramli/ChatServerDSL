package de.htwg.modellgetrieben.configLoader

import de.htwg.modellgetrieben.configLoader.server.ServerConfig

interface Config {
    fun createServer(name: String): ServerConfig
    fun loadServerConfig(name: String): ServerConfig
}