package de.htwg.modellgetrieben.dsl.builder.channel

import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel
import de.htwg.modellgetrieben.dsl.model.permission.VoicePermission
import de.htwg.modellgetrieben.dsl.builder.permission.VoicePermissionBuilder


class VoiceChannelBuilder {
    var name: String = ""
    var maxUser: Int = 255
    var bitrate: Int = 320

    private var permissions: VoicePermission? = null

    fun permissions(block: VoicePermissionBuilder.() -> Unit) {
        permissions = VoicePermissionBuilder().apply(block).build()
    }

    fun build(): VoiceChannel {
        val permissions = this.permissions
        if (permissions == null) {
            throw IllegalStateException("voice channel must have permissions.")
        } else {
            return VoiceChannel(name, permissions, maxUser, bitrate)
        }
    }

}