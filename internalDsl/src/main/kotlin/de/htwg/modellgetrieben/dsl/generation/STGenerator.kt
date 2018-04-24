package de.htwg.modellgetrieben.dsl.generation

import de.htwg.modellgetrieben.dsl.model.channel.TextChannel
import de.htwg.modellgetrieben.dsl.model.channel.VoiceChannel
import de.htwg.modellgetrieben.dsl.model.permission.PermissionState
import de.htwg.modellgetrieben.dsl.model.server.Server
import org.stringtemplate.v4.STGroupFile

object STGenerator {

    private fun transformPermissions(list: List<Pair<String, PermissionState>>): List<Pair<String, String>?> {
        return list.map {
            when (it.second) {
                PermissionState.ALLOWED -> it.first to "ALLOWED"
                PermissionState.FORBIDDEN -> it.first to "FORBIDDEN"
                PermissionState.Default -> null
            }
        }
    }

    private fun transformTextChannel(t: TextChannel): Map<String, Any?> {
        val permissions = listOf(
                "CreateInstantInvite" to t.permissions.createInstantInvite,
                "ManageChannel" to t.permissions.manageChannel,
                "ManagePermissions" to t.permissions.managePermissions,
                "ManageWebhooks" to t.permissions.manageWebhooks,
                "ReadMessages" to t.permissions.readMessages,
                "SendMessages" to t.permissions.sendMessages,
                "SendTTSMessages" to t.permissions.sendTTSMessages,
                "ManageMessages" to t.permissions.manageMessages,
                "EmbedLinks" to t.permissions.embedLinks,
                "AttachFiles" to t.permissions.attachFiles,
                "ReadMessageHistory" to t.permissions.readMessageHistory,
                "MentionEveryone" to t.permissions.mentionEveryone,
                "UseExternalEmojis" to t.permissions.useExternalEmojis,
                "AddReactions" to t.permissions.addReactions
        )

        return mapOf(
                "name" to t.name,
                "isNSFW" to if (t.isNSFW) "true" else null,
                "topic" to if (t.topic.isNotEmpty()) t.topic else null,
                "permissions" to transformPermissions(permissions)
        )
    }

    private fun transformVoiceChannel(v: VoiceChannel): Map<String, Any> {
        val permissions = listOf(
                "CreateInstantInvite" to v.permissions.createInstantInvite,
                "ManageChannel" to v.permissions.manageChannel,
                "ManagePermissions" to v.permissions.managePermissions,
                "ManageWebhooks" to v.permissions.manageWebhooks,
                "ViewChannel" to v.permissions.viewChannel,
                "Connect" to v.permissions.connect,
                "Speak" to v.permissions.speak,
                "MuteMembers" to v.permissions.muteMembers,
                "DeafenMembers" to v.permissions.deafenMembers,
                "MoveMembers" to v.permissions.moveMembers,
                "UseVoiceActivity" to v.permissions.useVoiceActivity
        )

        return mapOf(
                "name" to v.name,
                "maxUser" to v.maxUser,
                "bitrate" to v.bitrate,
                "permissions" to transformPermissions(permissions)
        )
    }

    private fun transformServer(s: Server): Map<String, Any?> {
        return mapOf(
                "name" to s.name,
                "textChannel" to s.textChannel.map(this::transformTextChannel),
                "voiceChannel" to s.voiceChannel.map(this::transformVoiceChannel)
        )
    }

    fun generate(servers: List<Server>): String {


        val chatConf = STGroupFile("templates/chatConfig.stg").getInstanceOf("config") ?: throw IllegalStateException("no instance of config")
        chatConf.add("servers", servers.map(this::transformServer))
        return chatConf.render()
    }

}