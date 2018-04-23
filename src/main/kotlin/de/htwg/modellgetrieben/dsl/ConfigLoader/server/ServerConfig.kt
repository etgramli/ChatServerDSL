package de.htwg.modellgetrieben.dsl.ConfigLoader.server

import de.htwg.modellgetrieben.dsl.model.server.Server

interface ServerConfig {
    fun createServer(srv: Server) {
        println(srv.name)
        println(srv.textChannel)
        println(srv.voiceChannel)
    }
}