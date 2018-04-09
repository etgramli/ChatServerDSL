package de.htwg.modellgetrieben.dsl.builder.channel

import de.htwg.modellgetrieben.dsl.builder.permission.VoicePermissionBuilder
import de.htwg.modellgetrieben.dsl.builder.server.ServerDSL
import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel
import de.htwg.modellgetrieben.dsl.model.permission.VoicePermission

@ServerDSL
class VoiceChannelBuilder {
    var name: String = ""
    var maxUser: Int = 255
    var bitrate: Int = 320

    private var permissions: VoicePermission = VoicePermission.default()

    fun permissions(block: VoicePermissionBuilder.() -> Unit) {
        permissions = VoicePermissionBuilder(permissions).apply(block).build()
    }

    fun build(): VoiceChannel {
        return VoiceChannel(name, permissions, maxUser, bitrate)

    }

}