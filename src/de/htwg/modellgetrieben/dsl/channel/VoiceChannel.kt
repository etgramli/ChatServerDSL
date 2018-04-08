package de.htwg.modellgetrieben.dsl.channel

import de.htwg.modellgetrieben.dsl.permission.VoicePermission


data class VoiceChannel(
        override val name: String,
        override val permissions: VoicePermission,
        val maxUser: Int,
        val bitrate: Int
) : Channel