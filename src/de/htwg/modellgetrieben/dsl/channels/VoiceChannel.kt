package de.htwg.modellgetrieben.dsl.channels

import de.htwg.modellgetrieben.dsl.Channel
import de.htwg.modellgetrieben.dsl.Permission


class VoiceChannel(override var name: String,
                   override var permissions: List<Permission>) : Channel {
    var maxUser: Int = 255
    var bitrate: Int = 320

}