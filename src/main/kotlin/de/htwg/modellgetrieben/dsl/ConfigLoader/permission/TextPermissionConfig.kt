package de.htwg.modellgetrieben.dsl.ConfigLoader.permission

import de.htwg.modellgetrieben.dsl.model.permission.TextPermission

interface TextPermissionConfig {
    fun createTextPermission(textPermission: TextPermission)
}