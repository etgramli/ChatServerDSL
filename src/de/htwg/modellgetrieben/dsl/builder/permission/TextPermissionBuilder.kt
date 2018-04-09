package de.htwg.modellgetrieben.dsl.builder.permission

import de.htwg.modellgetrieben.dsl.builder.server.ServerDSL
import de.htwg.modellgetrieben.dsl.model.permission.PermissionState
import de.htwg.modellgetrieben.dsl.model.permission.TextPermission

fun textpermission(block: TextPermissionBuilder.() -> Unit): TextPermission {
    return TextPermissionBuilder().apply(block).build()
}

@ServerDSL
class TextPermissionBuilder {

    private var createInstantInvite: PermissionState = PermissionState.Default
    private var manageChannel: PermissionState = PermissionState.Default
    private var managePermissions: PermissionState = PermissionState.Default
    private var manageWebhooks: PermissionState = PermissionState.Default
    private var readMessages: PermissionState = PermissionState.Default
    private var sendMessages: PermissionState = PermissionState.Default
    private var sendTTSMessages: PermissionState = PermissionState.Default
    private var manageMessages: PermissionState = PermissionState.Default
    private var embedLinks: PermissionState = PermissionState.Default
    private var attachFiles: PermissionState = PermissionState.Default
    private var readMessageHistory: PermissionState = PermissionState.Default
    private var mentionEveryone: PermissionState = PermissionState.Default
    private var useExternalEmojis: PermissionState = PermissionState.Default
    private var addReactions: PermissionState = PermissionState.Default


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

    fun allowReadMessages() {
        readMessages = PermissionState.ALLOWED
    }

    fun allowSendMessages() {
        sendMessages = PermissionState.ALLOWED
    }

    fun allowSendTTSMessages() {
        sendTTSMessages = PermissionState.ALLOWED
    }

    fun allowManageMessages() {
        manageMessages = PermissionState.ALLOWED
    }

    fun allowEmbedLinks() {
        embedLinks = PermissionState.ALLOWED
    }

    fun allowAttachFiles() {
        attachFiles = PermissionState.ALLOWED
    }

    fun allowReadMessageHistory() {
        readMessageHistory = PermissionState.ALLOWED
    }

    fun allowMentionEveryone() {
        mentionEveryone = PermissionState.ALLOWED
    }

    fun allowUseExternalEmojis() {
        useExternalEmojis = PermissionState.ALLOWED
    }

    fun allowAddReactions() {
        addReactions = PermissionState.ALLOWED
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

    fun forbidReadMessages() {
        readMessages = PermissionState.FORBIDDEN
    }

    fun forbidSendMessages() {
        sendMessages = PermissionState.FORBIDDEN
    }

    fun forbidSendTTSMessages() {
        sendTTSMessages = PermissionState.FORBIDDEN
    }

    fun forbidManageMessages() {
        manageMessages = PermissionState.FORBIDDEN
    }

    fun forbidEmbedLinks() {
        embedLinks = PermissionState.FORBIDDEN
    }

    fun forbidAttachFiles() {
        attachFiles = PermissionState.FORBIDDEN
    }

    fun forbidReadMessageHistory() {
        readMessageHistory = PermissionState.FORBIDDEN
    }

    fun forbidMentionEveryone() {
        mentionEveryone = PermissionState.FORBIDDEN
    }

    fun forbidUseExternalEmojis() {
        useExternalEmojis = PermissionState.FORBIDDEN
    }

    fun forbidAddReactions() {
        addReactions = PermissionState.FORBIDDEN
    }


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
