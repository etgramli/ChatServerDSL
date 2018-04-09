package de.htwg.modellgetrieben.dsl.builder.server

import de.htwg.modellgetrieben.dsl.builder.channel.TextChannelBuilder
import de.htwg.modellgetrieben.dsl.builder.channel.VoiceChannelBuilder
import de.htwg.modellgetrieben.dsl.model.channel.TextChannel
import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel
import de.htwg.modellgetrieben.dsl.model.server.Server

fun server(block: ServerBuilder.() -> Unit): Server =
        ServerBuilder().apply(block).build()

@ServerDSL
class ServerBuilder {

    var name: String = ""

    private val voiceChannel = mutableListOf<VoiceChannel>()
    private val textChannel = mutableListOf<TextChannel>()

    fun voiceChannel(block: VoiceChannelBuilder.() -> Unit) {
        voiceChannel.add(VoiceChannelBuilder().apply(block).build())
    }

    fun textChannel(block: TextChannelBuilder.() -> Unit) {
        textChannel.add(TextChannelBuilder().apply(block).build())
    }

    fun build(): Server {
        return Server(name, textChannel, voiceChannel)
    }


}