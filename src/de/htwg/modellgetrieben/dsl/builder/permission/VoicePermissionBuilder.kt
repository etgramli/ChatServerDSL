package de.htwg.modellgetrieben.dsl.builder.permission

import de.htwg.modellgetrieben.dsl.permission.PermissionState
import de.htwg.modellgetrieben.dsl.permission.VoicePermission

class VoicePermissionBuilder {
    private var createInstantInvite: PermissionState = PermissionState.Default
    private var manageChannel: PermissionState = PermissionState.Default
    private var managePermissions: PermissionState = PermissionState.Default
    private var manageWebhooks: PermissionState = PermissionState.Default
    private var viewChannel: PermissionState = PermissionState.Default
    private var connect: PermissionState = PermissionState.Default
    private var speak: PermissionState = PermissionState.Default
    private var muteMembers: PermissionState = PermissionState.Default
    private var deafenMembers: PermissionState = PermissionState.Default
    private var moveMembers: PermissionState = PermissionState.Default
    private var useVoiceActivity: PermissionState = PermissionState.Default


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