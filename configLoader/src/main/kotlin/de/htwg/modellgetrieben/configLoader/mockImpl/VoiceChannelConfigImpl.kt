package de.htwg.modellgetrieben.configLoader.mockImpl

import de.htwg.modellgetrieben.configLoader.channel.VoiceChannelConfig
import de.htwg.modellgetrieben.configLoader.permission.PermissionState

class VoiceChannelConfigImpl(name: String) : VoiceChannelConfig {
    override fun createVoiceChannel(name: String) {
        setName(name)
    }

    override fun setName(name: String) {
        println("Voice channel name: $name")
    }

    override fun setMaxUsers(number: Int) {
        println("Max users: $number")
    }

    override fun setBitrate(bitrate: Int) {
        println("Bitrate: $bitrate")
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
    override fun setViewChannel(state: PermissionState) {
        println("viewChannel: $state")
    }
    override fun setConnect(state: PermissionState) {
        println("connect: $state")
    }
    override fun setSpeak(state: PermissionState) {
        println("speak: $state")
    }
    override fun setMuteMembers(state: PermissionState) {
        println("muteMembers: $state")
    }
    override fun setDeafenMembers(state: PermissionState) {
        println("deafenMembers: $state")
    }
    override fun setMoveMembers(state: PermissionState) {
        println("moveMembers: $state")
    }
    override fun setUseVoiceActivity(state: PermissionState) {
        println("useVoiceActivity: $state")
    }
}