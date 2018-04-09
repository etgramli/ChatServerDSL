package de.htwg.modellgetrieben.dsl

import de.htwg.modellgetrieben.dsl.builder.server.server


fun main(args: Array<String>) {
    val scope = "DSL"
    println("Hello, $scope!")

    val ret = server {
        name = "Kati Winter"
        voiceChannel {
            name = "chatroom"
            permissions {
                allowConnect()
                forbidDeafenMembers()
            }
        }
    }

    println(ret)

}
