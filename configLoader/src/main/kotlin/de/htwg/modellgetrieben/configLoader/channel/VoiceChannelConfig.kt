package de.htwg.modellgetrieben.configLoader.channel

import de.htwg.modellgetrieben.configLoader.permission.PermissionState

interface VoiceChannelConfig {
    fun createVoiceChannel(name: String)

    fun setName (name: String)
    fun setMaxUsers(number: Int)
    fun setBitrate(bitrate: Int)

    fun setCreateInstantInvite(state: PermissionState)
    fun setManageChannel(state: PermissionState)
    fun setManagePermissions(state: PermissionState)
    fun setManageWebhooks(state: PermissionState)
    fun setViewChannel(state: PermissionState)
    fun setConnect(state: PermissionState)
    fun setSpeak(state: PermissionState)
    fun setMuteMembers(state: PermissionState)
    fun setDeafenMembers(state: PermissionState)
    fun setMoveMembers(state: PermissionState)
    fun setUseVoiceActivity(state: PermissionState)
}