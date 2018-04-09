package de.htwg.modellgetrieben.dsl.permission

interface Permission {
    val createInstantInvite: PermissionState
    val manageChannel: PermissionState
    val managePermissions: PermissionState
    val manageWebhooks: PermissionState
}