
import de.htwg.modellgetrieben.configLoader.mockImpl.ConfigImpl
import de.htwg.modellgetrieben.configLoader.permission.PermissionState

fun main(args: Array<String>) {
    val config = ConfigImpl()
    config.createServer("Discord").let { server ->
        server.addTextChannel("chatroom").let { textChannel ->
            textChannel.setEmbedLinks(PermissionState.FORBIDDEN)
            textChannel.setAttachFiles(PermissionState.ALLOWED)
        }

        server.addTextChannel("scala").let { textChannel ->
            textChannel.setIsNSFW(true)
            textChannel.setTopic("Discussion on whether or not we should use Scala in mgse.")
            textChannel.setEmbedLinks(PermissionState.FORBIDDEN)
            textChannel.setAttachFiles(PermissionState.FORBIDDEN)
            textChannel.setAddReactions(PermissionState.FORBIDDEN)
        }
        server.addVoiceChannel("Lounge").let { voiceChannel ->
            voiceChannel.setMaxUsers(255)
            voiceChannel.setBitrate(160)
            voiceChannel.setManagePermissions(PermissionState.FORBIDDEN)
            voiceChannel.setConnect(PermissionState.ALLOWED)
        }

        server.addVoiceChannel("Lounge1").let { voiceChannel ->
            voiceChannel.setMaxUsers(5)
            voiceChannel.setBitrate(320)
            voiceChannel.setManagePermissions(PermissionState.FORBIDDEN)
            voiceChannel.setConnect(PermissionState.ALLOWED)
        }
    }
}