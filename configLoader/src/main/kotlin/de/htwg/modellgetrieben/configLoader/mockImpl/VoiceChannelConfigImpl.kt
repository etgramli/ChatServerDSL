package de.htwg.modellgetrieben.configLoader.mockImpl

import de.htwg.modellgetrieben.configLoader.channel.VoiceChannelConfig

class VoiceChannelConfigImpl(name: String) : VoiceChannelConfig {
    override fun createVoiceChannel(name: String, maxUser: Int, bitrate: Int) {
        super.createVoiceChannel(name, maxUser, bitrate)
    }

    override fun setName(name: String) {
        super.setName(name)
    }

    override fun setMaxUsers(number: Int) {
        super.setMaxUsers(number)
    }

    override fun setBitrate(bitrate: Int) {
        super.setBitrate(bitrate)
    }
}