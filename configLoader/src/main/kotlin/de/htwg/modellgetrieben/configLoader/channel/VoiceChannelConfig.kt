package de.htwg.modellgetrieben.configLoader.channel

interface VoiceChannelConfig {
    fun createVoiceChannel(name: String,
                           maxUser: Int,
                           bitrate: Int) {
        setName(name)
        setMaxUsers(maxUser)
        setBitrate(bitrate)
        //println(voiceChannel.permissions)
    }

    fun setName (name: String) {
        println("Voice channel name: $name")
    }
    fun setMaxUsers(number: Int) {
        println("Max number of users: $number")
    }
    fun setBitrate(bitrate: Int) {
        println("Bitrate: $bitrate")
    }
    // ToDo: permissions: VoicePermission,
}