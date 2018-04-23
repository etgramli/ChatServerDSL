package de.htwg.modellgetrieben.configLoader.mockImpl

import de.htwg.modellgetrieben.configLoader.channel.TextChannelConfig

class TextChannelConfigImpl(name: String): TextChannelConfig {
    val createInstantInvite: PermissionState = PermissionState.Default
    val manageChannel: PermissionState = PermissionState.Default
    val managePermissions: PermissionState = PermissionState.Default
    val manageWebhooks: PermissionState = PermissionState.Default
    val readMessages: PermissionState = PermissionState.Default
    val sendMessages: PermissionState = PermissionState.Default
    val sendTTSMessages: PermissionState = PermissionState.Default
    val manageMessages: PermissionState = PermissionState.Default
    val embedLinks: PermissionState = PermissionState.Default
    val attachFiles: PermissionState = PermissionState.Default
    val readMessageHistory: PermissionState = PermissionState.Default
    val mentionEveryone: PermissionState = PermissionState.Default
    val useExternalEmojis: PermissionState = PermissionState.Default
    val addReactions: PermissionState = PermissionState.Default


    override fun createTextChannel(name: String,
                                   topic: String,
                                   isNSFW: Boolean) {
        super.createTextChannel(name, topic, isNSFW)
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


    fun setCreateInstantInvite(state: PermissionState) {
        println("createInstantInvite: $state")
    }
    fun setManageChannel(state: PermissionState) {
        println("manageChannel: $state")
    }
    fun setManagePermissions(state: PermissionState) {
        println("managePermissions: $state")
    }
    fun setManageWebhooks(state: PermissionState) {
        println("manageWebhooks: $state")
    }
    fun setReadMessages(state: PermissionState) {
        println("readMessages: $state")
    }
    fun setSendMessages(state: PermissionState) {
        println("sendMessages: $state")
    }
    fun setSendTTSMessages(state: PermissionState) {
        println("sendTTSMessages: $state")
    }
    fun setManageMessages(state: PermissionState) {
        println("manageMessages: $state")
    }
    fun setEmbedLinks(state: PermissionState) {
        println("embedLinks: $state")
    }
    fun setAttachFiles(state: PermissionState) {
        println("attachFiles: $state")
    }
    fun setReadMessageHistory(state: PermissionState) {
        println("readMessageHistory: $state")
    }
    fun setMentionEveryone(state: PermissionState) {
        println("mentionEveryone: $state")
    }
    fun setUseExternalEmojis(state: PermissionState) {
        println("useExternalEmojis: $state")
    }
    fun setAddReactions(state: PermissionState) {
        println("addReactions: $state")
    }
}