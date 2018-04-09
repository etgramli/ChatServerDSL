package de.htwg.modellgetrieben.dsl.permission.builders

import de.htwg.modellgetrieben.dsl.permission.PermissionState
import de.htwg.modellgetrieben.dsl.permission.TextPermission

fun textpermission(block: TextPermissionBuilder.() -> Unit): TextPermission {
    return TextPermissionBuilder().apply(block).build()
}

class TextPermissionBuilder : PermissionBuilder() {

    var createInstantInvite: PermissionState = PermissionState.Default
    var manageChannel: PermissionState = PermissionState.Default
    var managePermissions: PermissionState = PermissionState.Default
    var manageWebhooks: PermissionState = PermissionState.Default
    var readMessages: PermissionState = PermissionState.Default
    var sendMessages: PermissionState = PermissionState.Default
    var sendTTSMessages: PermissionState = PermissionState.Default
    var manageMessages: PermissionState = PermissionState.Default
    var embedLinks: PermissionState = PermissionState.Default
    var attachFiles: PermissionState = PermissionState.Default
    var readMessageHistory: PermissionState = PermissionState.Default
    var mentionEveryone: PermissionState = PermissionState.Default
    var useExternalEmojis: PermissionState = PermissionState.Default
    var addReactions: PermissionState = PermissionState.Default


    fun build(): TextPermission =
            TextPermission(
                    createInstantInvite,
                    manageChannel,
                    managePermissions,
                    manageWebhooks,
                    readMessages,
                    sendMessages,
                    sendTTSMessages,
                    manageMessages,
                    embedLinks,
                    attachFiles,
                    readMessageHistory,
                    mentionEveryone,
                    useExternalEmojis,
                    addReactions
            )


}
