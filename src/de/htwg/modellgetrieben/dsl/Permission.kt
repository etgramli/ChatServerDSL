package de.htwg.modellgetrieben.dsl

import de.htwg.modellgetrieben.dsl.permissions.PermissionState
import de.htwg.modellgetrieben.dsl.permissions.PermissionType

interface Permission {
    var set: PermissionState
    var type: PermissionType
}