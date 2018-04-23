package de.htwg.modellgetrieben.configLoader.server

import de.htwg.modellgetrieben.dsl.model.server.Server

interface ServerConfig {
    fun createServer(srv: Server) {
        println(srv.name)
        println(srv.textChannel)
        println(srv.voiceChannel)
    }
}