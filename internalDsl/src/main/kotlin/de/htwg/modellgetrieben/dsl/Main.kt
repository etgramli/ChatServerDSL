package de.htwg.modellgetrieben.dsl

import de.htwg.modellgetrieben.dsl.builder.server.server


fun main(args: Array<String>) {
    val dsl = server {
        name = "Discord"
        textChannel {
            name = "chatroom"
            permissions {
                allowAttachFiles()
                forbidEmbedLinks()
            }
        }
        textChannel {
            name = "scala"
            setNSFW()
            permissions {
                forbidAddReactions()
                forbidEmbedLinks()
                forbidAttachFiles()
            }
            topic = """
                    Discussion on whether or not we should use Scala in mgse.
            """.trimIndent()
        }
        voiceChannel {
            name = "Lounge"
            bitrate = 160
            permissions {
                allowConnect()
                forbidManagePermissions()
            }
        }
        voiceChannel {
            name = "Lounge1"
            maxUser = 5
            permissions {
                allowConnect()
                forbidManagePermissions()
            }
        }
    }

    println(dsl)

}
