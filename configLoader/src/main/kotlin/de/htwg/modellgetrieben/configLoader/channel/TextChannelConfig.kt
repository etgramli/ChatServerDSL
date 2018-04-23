package de.htwg.modellgetrieben.configLoader.channel

interface TextChannelConfig {
    fun createTextChannel(name: String,
                          topic: String,
                          isNSFW: Boolean) {
        setName(name)
        setTopic(topic)
        setIsNSFW(isNSFW)
        //println(textChannel.permissions)
    }

    fun setName(name: String) {
        println("Text channel name: $name")
    }
    fun setTopic(topic: String) {
        println("Topic: $topic")
    }
    fun setIsNSFW(isNSFW: Boolean) {
        println("Is NSFW: $isNSFW")
    }
}