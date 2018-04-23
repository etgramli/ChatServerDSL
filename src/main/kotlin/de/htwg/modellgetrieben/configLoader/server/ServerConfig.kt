package de.htwg.modellgetrieben.configLoader.server

import de.htwg.modellgetrieben.configLoader.channel.TextChannelConfig
import de.htwg.modellgetrieben.configLoader.channel.VoiceChannelConfig

interface ServerConfig {
    fun setName(name: String)
    fun addTextChannel(name: String): TextChannelConfig
    fun addVoiceChannel(name: String): VoiceChannelConfig

    fun loadTextChannelConfig(name: String): TextChannelConfig
    fun loadVoiceChannelConfig(name: String): VoiceChannelConfig
}
