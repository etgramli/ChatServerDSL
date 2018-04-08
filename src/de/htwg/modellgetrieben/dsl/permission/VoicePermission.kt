package de.htwg.modellgetrieben.dsl.permission

data class VoicePermission(
        override val createInstantInvite: PermissionState,
        override val manageChannel: PermissionState,
        override val managePermissions: PermissionState,
        override val manageWebhooks: PermissionState,
        val viewChannel: PermissionState,
        val connect: PermissionState,
        val speak: PermissionState,
        val muteMembers: PermissionState,
        val deafenMembers: PermissionState,
        val moveMembers: PermissionState,
        val useVoiceActivity: PermissionState

) : Permission