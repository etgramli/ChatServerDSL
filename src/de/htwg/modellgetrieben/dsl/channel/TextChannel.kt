package de.htwg.modellgetrieben.dsl.channel

import de.htwg.modellgetrieben.dsl.permission.TextPermission


data class TextChannel(
        override val name: String,
        override val permissions: TextPermission,
        val isNSFW: Boolean,
        val topic: String
) : Channel