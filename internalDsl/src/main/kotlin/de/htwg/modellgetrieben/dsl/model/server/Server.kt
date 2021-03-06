package de.htwg.modellgetrieben.dsl.model.server

import de.htwg.modellgetrieben.dsl.model.channel.TextChannel
import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel

data class Server(
        val name: String,
        val textChannel: List<TextChannel>,
        val voiceChannel: List<VoiceChannel>
)
