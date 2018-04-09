package de.htwg.modellgetrieben.dsl.model.permission

data class TextPermission(
        override val createInstantInvite: PermissionState = PermissionState.Default,
        override val manageChannel: PermissionState = PermissionState.Default,
        override val managePermissions: PermissionState = PermissionState.Default,
        override val manageWebhooks: PermissionState = PermissionState.Default,
        val readMessages: PermissionState = PermissionState.Default,
        val sendMessages: PermissionState = PermissionState.Default,
        val sendTTSMessages: PermissionState = PermissionState.Default,
        val manageMessages: PermissionState = PermissionState.Default,
        val embedLinks: PermissionState = PermissionState.Default,
        val attachFiles: PermissionState = PermissionState.Default,
        val readMessageHistory: PermissionState = PermissionState.Default,
        val mentionEveryone: PermissionState = PermissionState.Default,
        val useExternalEmojis: PermissionState = PermissionState.Default,
        val addReactions: PermissionState = PermissionState.Default
) : Permission {
    companion object {
        fun default() = TextPermission(
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default,
                PermissionState.Default
        )
    }
}
