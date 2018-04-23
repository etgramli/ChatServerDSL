package de.htwg.modellgetrieben.dsl.builder.channel

import de.htwg.modellgetrieben.dsl.builder.permission.TextPermissionBuilder
import de.htwg.modellgetrieben.dsl.builder.server.ServerDSL
import de.htwg.modellgetrieben.dsl.model.channel.TextChannel
import de.htwg.modellgetrieben.dsl.model.permission.TextPermission


@Suppress("unused")
@ServerDSL
class TextChannelBuilder {

    var name: String = ""
    var topic: String = ""

    private var permissions: TextPermission = TextPermission.default()
    private var isNSFW: Boolean = false

    fun setNSFW() {
        isNSFW = true
    }

    fun permissions(block: TextPermissionBuilder.() -> Unit) {
        permissions = TextPermissionBuilder(permissions).apply(block).build()
    }

    fun build(): TextChannel {
        val name = this.name.trim()
        if (name.isEmpty())
            throw IllegalArgumentException("Textchannel name is empty")
        return TextChannel(name, permissions, isNSFW, topic)
    }

}