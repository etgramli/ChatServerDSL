package de.htwg.modellgetrieben.dsl.builder.permission

import de.htwg.modellgetrieben.dsl.builder.server.ServerDSL
import de.htwg.modellgetrieben.dsl.model.permission.PermissionState
import de.htwg.modellgetrieben.dsl.model.permission.TextPermission

@ServerDSL
class TextPermissionBuilder(old : TextPermission) {
    private var createInstantInvite: PermissionState = old.createInstantInvite
    private var manageChannel: PermissionState = old.manageChannel
    private var managePermissions: PermissionState = old.managePermissions
    private var manageWebhooks: PermissionState = old.manageWebhooks
    private var readMessages: PermissionState = old.readMessages
    private var sendMessages: PermissionState = old.sendMessages
    private var sendTTSMessages: PermissionState = old.sendTTSMessages
    private var manageMessages: PermissionState = old.manageMessages
    private var embedLinks: PermissionState = old.embedLinks
    private var attachFiles: PermissionState = old.attachFiles
    private var readMessageHistory: PermissionState = old.readMessageHistory
    private var mentionEveryone: PermissionState = old.mentionEveryone
    private var useExternalEmojis: PermissionState = old.useExternalEmojis
    private var addReactions: PermissionState = old.addReactions


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
