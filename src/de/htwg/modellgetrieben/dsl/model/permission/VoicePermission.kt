package de.htwg.modellgetrieben.dsl.model.permission

data class VoicePermission(
        override val createInstantInvite: PermissionState = PermissionState.Default,
        override val manageChannel: PermissionState = PermissionState.Default,
        override val managePermissions: PermissionState = PermissionState.Default,
        override val manageWebhooks: PermissionState = PermissionState.Default,
        val viewChannel: PermissionState = PermissionState.Default,
        val connect: PermissionState = PermissionState.Default,
        val speak: PermissionState = PermissionState.Default,
        val muteMembers: PermissionState = PermissionState.Default,
        val deafenMembers: PermissionState = PermissionState.Default,
        val moveMembers: PermissionState = PermissionState.Default,
        val useVoiceActivity: PermissionState = PermissionState.Default
) : Permission
