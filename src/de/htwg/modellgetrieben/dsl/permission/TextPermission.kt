package de.htwg.modellgetrieben.dsl.permission

data class TextPermission(
        override val createInstantInvite: PermissionState,
        override val manageChannel: PermissionState,
        override val managePermissions: PermissionState,
        override val manageWebhooks: PermissionState,
        val readMessages: PermissionState,
        val sendMessages: PermissionState,
        val sendTTSMessages: PermissionState,
        val manageMessages: PermissionState,
        val embedLinks: PermissionState,
        val attachFiles: PermissionState,
        val readMessageHistory: PermissionState,
        val mentionEveryone: PermissionState,
        val useExternalEmojis: PermissionState,
        val addReactions: PermissionState
) : Permission