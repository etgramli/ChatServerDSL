package de.htwg.modellgetrieben.dsl

import de.htwg.modellgetrieben.dsl.permission.PermissionState
import de.htwg.modellgetrieben.dsl.permission.builders.textpermission


fun main(args: Array<String>) {
    val scope = "DSL"
    println("Hello, $scope!")

    val ret = textpermission {
        createInstantInvite = PermissionState.ALLOWED
    }

    println(ret)

}
