package de.htwg.modellgetrieben.dsl.builder.channel

import de.htwg.modellgetrieben.dsl.builder.permission.VoicePermissionBuilder
import de.htwg.modellgetrieben.dsl.builder.server.ServerDSL
import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel
import de.htwg.modellgetrieben.dsl.model.permission.VoicePermission

@Suppress("unused")
@ServerDSL
class VoiceChannelBuilder {
    companion object {
        val maxUsersMaxValue = 255
        val bitRateMaxValue = 320
    }

    var name: String = ""
    var maxUser: Int = maxUsersMaxValue
    var bitrate: Int = bitRateMaxValue

    private var permissions: VoicePermission = VoicePermission.default()

    fun permissions(block: VoicePermissionBuilder.() -> Unit) {
        permissions = VoicePermissionBuilder(permissions).apply(block).build()
    }

    fun build(): VoiceChannel {
        val name = this.name.trim()
        if (name.isEmpty())
            throw IllegalArgumentException("Voice channel name is empty")
        return VoiceChannel(name, permissions, maxUser, bitrate)

    }

}