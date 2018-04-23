package de.htwg.modellgetrieben.dsl.ConfigLoader.channel

import de.htwg.modellgetrieben.dsl.model.channel.TextChannel

interface TextChannelConfig {
    fun createTextChannel(textChannel: TextChannel) {
        println(textChannel.name)
        println(textChannel.topic)
        println(textChannel.isNSFW)
        //println(textChannel.permissions)
    }
}