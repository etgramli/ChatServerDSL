package de.htwg.modellgetrieben.dsl

import de.htwg.modellgetrieben.dsl.builder.permission.textpermission


fun main(args: Array<String>) {
    val scope = "DSL"
    println("Hello, $scope!")

    val ret = textpermission {
        allowManageChannel()
        forbidCreateInstantInvite()
    }

    println(ret)

}
