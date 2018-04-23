package de.htwg.modellgetrieben.configLoader.channel

import de.htwg.modellgetrieben.configLoader.permission.PermissionState

interface TextChannelConfig {
    fun setName(name: String)
    fun setTopic(topic: String)
    fun setIsNSFW(isNSFW: Boolean)

    fun setCreateInstantInvite(state: PermissionState)
    fun setManageChannel(state: PermissionState)
    fun setManagePermissions(state: PermissionState)
    fun setManageWebhooks(state: PermissionState)
    fun setReadMessages(state: PermissionState)
    fun setSendMessages(state: PermissionState)
    fun setSendTTSMessages(state: PermissionState)
    fun setManageMessages(state: PermissionState)
    fun setEmbedLinks(state: PermissionState)
    fun setAttachFiles(state: PermissionState)
    fun setReadMessageHistory(state: PermissionState)
    fun setMentionEveryone(state: PermissionState)
    fun setUseExternalEmojis(state: PermissionState)
    fun setAddReactions(state: PermissionState)
}