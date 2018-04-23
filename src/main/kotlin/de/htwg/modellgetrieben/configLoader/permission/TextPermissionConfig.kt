package de.htwg.modellgetrieben.configLoader.permission

import de.htwg.modellgetrieben.dsl.model.permission.TextPermission

interface TextPermissionConfig {
    fun createTextPermission(textPermission: TextPermission)
}