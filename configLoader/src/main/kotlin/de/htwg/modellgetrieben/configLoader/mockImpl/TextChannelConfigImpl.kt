package de.htwg.modellgetrieben.configLoader.mockImpl

import de.htwg.modellgetrieben.configLoader.channel.TextChannelConfig
import de.htwg.modellgetrieben.configLoader.permission.PermissionState

class TextChannelConfigImpl(name: String): TextChannelConfig {

    override fun createTextChannel(name: String,
                                   topic: String,
                                   isNSFW: Boolean) {
        setName(name)
        setTopic(topic)
        setIsNSFW(isNSFW)
    }

    override fun setName(name: String) {
        println("Text channel name: $name")
    }

    override fun setTopic(topic: String) {
        println("Text channel topic: $topic")
    }

    override fun setIsNSFW(isNSFW: Boolean) {
        println("Text channel is NSFW: $isNSFW")
    }


    override fun setCreateInstantInvite(state: PermissionState) {
        println("createInstantInvite: $state")
    }
    override fun setManageChannel(state: PermissionState) {
        println("manageChannel: $state")
    }
    override fun setManagePermissions(state: PermissionState) {
        println("managePermissions: $state")
    }
    override fun setManageWebhooks(state: PermissionState) {
        println("manageWebhooks: $state")
    }
    override fun setReadMessages(state: PermissionState) {
        println("readMessages: $state")
    }
    override fun setSendMessages(state: PermissionState) {
        println("sendMessages: $state")
    }
    override fun setSendTTSMessages(state: PermissionState) {
        println("sendTTSMessages: $state")
    }
    override fun setManageMessages(state: PermissionState) {
        println("manageMessages: $state")
    }
    override fun setEmbedLinks(state: PermissionState) {
        println("embedLinks: $state")
    }
    override fun setAttachFiles(state: PermissionState) {
        println("attachFiles: $state")
    }
    override fun setReadMessageHistory(state: PermissionState) {
        println("readMessageHistory: $state")
    }
    override fun setMentionEveryone(state: PermissionState) {
        println("mentionEveryone: $state")
    }
    override fun setUseExternalEmojis(state: PermissionState) {
        println("useExternalEmojis: $state")
    }
    override fun setAddReactions(state: PermissionState) {
        println("addReactions: $state")
    }
}