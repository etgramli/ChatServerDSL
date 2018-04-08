package de.htwg.modellgetrieben.dsl.channel

import de.htwg.modellgetrieben.dsl.permission.Permission


data class TextChannel(
        override val name: String,
        override val permissions: List<Permission>,
        val isNSFW: Boolean,
        val topic: String
) : Channel