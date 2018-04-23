package de.htwg.modellgetrieben.configLoader.mockImpl

import de.htwg.modellgetrieben.configLoader.channel.TextChannelConfig
import de.htwg.modellgetrieben.configLoader.channel.VoiceChannelConfig
import de.htwg.modellgetrieben.configLoader.server.ServerConfig

class ServerConfigImpl(name: String) : ServerConfig {

    override fun setName(name: String) {
        println("Server name: $name")
    }

    override fun addTextChannel(name: String): TextChannelConfig {
        println("Text channel: $name")

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addVoiceChannel(name: String): VoiceChannelConfig {
        println("Voice channel: $name")

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadTextChannelConfig(name: String): TextChannelConfig {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadVoiceChannelConfig(name: String): VoiceChannelConfig {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}