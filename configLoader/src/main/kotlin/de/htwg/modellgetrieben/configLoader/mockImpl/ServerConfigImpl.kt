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
        return TextChannelConfigImpl(name)
    }

    override fun addVoiceChannel(name: String): VoiceChannelConfig {
        println("Voice channel: $name")
        return VoiceChannelConfigImpl(name)
    }

    override fun loadTextChannelConfig(name: String): TextChannelConfig {
        return TextChannelConfigImpl(name)
    }

    override fun loadVoiceChannelConfig(name: String): VoiceChannelConfig {
        return VoiceChannelConfigImpl(name)
    }


}