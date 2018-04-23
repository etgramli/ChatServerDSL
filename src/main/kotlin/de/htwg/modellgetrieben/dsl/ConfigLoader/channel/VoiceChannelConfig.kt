package de.htwg.modellgetrieben.dsl.ConfigLoader.channel

import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel

interface VoiceChannelConfig {
    fun createVoiceChannel(voiceChannel: VoiceChannel) {
        println(voiceChannel.name)
        println(voiceChannel.maxUser)
        println(voiceChannel.bitrate)
        //println(voiceChannel.permissions)
    }
}