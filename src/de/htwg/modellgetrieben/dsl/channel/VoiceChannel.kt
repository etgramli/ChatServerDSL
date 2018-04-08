package de.htwg.modellgetrieben.dsl.channel

import de.htwg.modellgetrieben.dsl.permission.Permission


data class VoiceChannel(
        override val name: String,
        override val permissions: List<Permission>,
        val maxUser: Int,
        val bitrate: Int
) : Channel