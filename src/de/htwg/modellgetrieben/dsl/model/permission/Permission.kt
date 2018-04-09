package de.htwg.modellgetrieben.dsl.model.permission

interface Permission {
    val createInstantInvite: PermissionState
    val manageChannel: PermissionState
    val managePermissions: PermissionState
    val manageWebhooks: PermissionState
}