package de.htwg.modellgetrieben.configLoader.mockImpl

import de.htwg.modellgetrieben.configLoader.channel.TextChannelConfig

class TextChannelConfigImpl(name: String): TextChannelConfig {
    override fun createTextChannel(name: String,
                                   topic: String,
                                   isNSFW: Boolean) {
        super.createTextChannel(name, topic, isNSFW)
        // ToDo: Add permission
    }

    override fun setName(name: String) {
        println("Text channel name: $name")
    }

    override fun setTopic(topic: String) {
        println("Text channel topic: $topic")
    }

    override fun setIsNSFW(isNSFW: Boolean) {
        println("Text channel is NSFW: $isNSFW")
    }
}