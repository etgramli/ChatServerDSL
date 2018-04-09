package de.htwg.modellgetrieben.dsl.builder.permission

import de.htwg.modellgetrieben.dsl.builder.server.ServerDSL
import de.htwg.modellgetrieben.dsl.model.permission.PermissionState
import de.htwg.modellgetrieben.dsl.model.permission.VoicePermission

@ServerDSL
class VoicePermissionBuilder(old: VoicePermission) {
    private var createInstantInvite: PermissionState = old.createInstantInvite
    private var manageChannel: PermissionState = old.manageChannel
    private var managePermissions: PermissionState = old.managePermissions
    private var manageWebhooks: PermissionState = old.manageWebhooks
    private var viewChannel: PermissionState = old.viewChannel
    private var connect: PermissionState = old.connect
    private var speak: PermissionState = old.speak
    private var muteMembers: PermissionState = old.muteMembers
    private var deafenMembers: PermissionState = old.deafenMembers
    private var moveMembers: PermissionState = old.moveMembers
    private var useVoiceActivity: PermissionState = old.useVoiceActivity


    fun allowCreateInstantInvite() {
        createInstantInvite = PermissionState.ALLOWED
    }
    fun allowManageChannel() {
        manageChannel = PermissionState.ALLOWED
    }
    fun allowManagePermissions() {
        managePermissions = PermissionState.ALLOWED
    }
    fun allowManageWebhooks() {
        manageWebhooks = PermissionState.ALLOWED
    }
    fun allowViewChannel() {
        viewChannel = PermissionState.ALLOWED
    }
    fun allowConnect() {
        connect = PermissionState.ALLOWED
    }
    fun allowSpeak() {
        speak = PermissionState.ALLOWED
    }
    fun allowMuteMembers() {
        muteMembers = PermissionState.ALLOWED
    }
    fun allowDeafenMembers() {
        deafenMembers = PermissionState.ALLOWED
    }
    fun allowMoveMembers() {
        moveMembers = PermissionState.ALLOWED
    }
    fun allowUseVoiceActivity() {
        useVoiceActivity = PermissionState.ALLOWED
    }

    fun forbidCreateInstantInvite() {
        createInstantInvite = PermissionState.FORBIDDEN
    }
    fun forbidManageChannel() {
        manageChannel = PermissionState.FORBIDDEN
    }
    fun forbidManagePermissions() {
        managePermissions = PermissionState.FORBIDDEN
    }
    fun forbidManageWebhooks() {
        manageWebhooks = PermissionState.FORBIDDEN
    }
    fun forbidViewChannel() {
        viewChannel = PermissionState.FORBIDDEN
    }
    fun forbidConnect() {
        connect = PermissionState.FORBIDDEN
    }
    fun forbidSpeak() {
        speak = PermissionState.FORBIDDEN
    }
    fun forbidMuteMembers() {
        muteMembers = PermissionState.FORBIDDEN
    }
    fun forbidDeafenMembers() {
        deafenMembers = PermissionState.FORBIDDEN
    }
    fun forbidMoveMembers() {
        moveMembers = PermissionState.FORBIDDEN
    }
    fun forbidUseVoiceActivity() {
        useVoiceActivity = PermissionState.FORBIDDEN
    }


    fun build(): VoicePermission =
            VoicePermission(
                    createInstantInvite,
                    manageChannel,
                    managePermissions,
                    manageWebhooks,
                    viewChannel,
                    connect,
                    speak,
                    muteMembers,
                    deafenMembers,
                    moveMembers,
                    useVoiceActivity
            )

}