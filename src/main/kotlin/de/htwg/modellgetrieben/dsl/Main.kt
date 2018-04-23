package de.htwg.modellgetrieben.dsl

import de.htwg.modellgetrieben.dsl.builder.server.server


fun main(args: Array<String>) {
    val scope = "DSL"
    println("Hello, $scope!")

    val ret = server {
        name = "Kati Winter"
        textChannel {
            name = "chatroom"
            permissions {
                allowAttachFiles()
                forbidEmbedLinks()
            }
        }
        voiceChannel {
            name = "Lounge"
            permissions {
                allowConnect()
                forbidManagePermissions()
            }
        }
        voiceChannel {
            name = "Lounge1"
            permissions {
                allowConnect()
                forbidManagePermissions()
            }
        }
    }

    println(ret)

}
