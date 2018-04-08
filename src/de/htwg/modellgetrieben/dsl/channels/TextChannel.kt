package de.htwg.modellgetrieben.dsl.channels

import de.htwg.modellgetrieben.dsl.Channel
import de.htwg.modellgetrieben.dsl.Permission


class TextChannel(override var name: String,
                  override var permissions: List<Permission>) : Channel {
    var isNSFW: Boolean = false
    var topic: String = ""
}