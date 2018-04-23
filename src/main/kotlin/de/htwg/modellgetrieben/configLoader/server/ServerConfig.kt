package de.htwg.modellgetrieben.configLoader.server

import de.htwg.modellgetrieben.dsl.model.channel.TextChannel
import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel
import de.htwg.modellgetrieben.dsl.model.server.Server

interface ServerConfig {
    fun createServer(name: String,
                     textChannels: List<TextChannel>,
                     voiceChannels: List<VoiceChannel>) {
        setName(name)
        setTextChannels(textChannels)
        setVoiceChannels(voiceChannels)
    }

    fun setName(name: String) {
        println("Server name: $name")
    }
    fun setTextChannels(channels: List<TextChannel>) {
        println("Text channels:")
        for (channel in channels)
            println(channel.name)
    }
    fun setVoiceChannels(channels: List<VoiceChannel>) {
        println("Voice channels:")
        for (channel in channels)
            println(channel.name)}
}
