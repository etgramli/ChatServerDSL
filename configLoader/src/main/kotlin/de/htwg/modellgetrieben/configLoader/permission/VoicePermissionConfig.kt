package de.htwg.modellgetrieben.configLoader.permission

import de.htwg.modellgetrieben.dsl.model.permission.VoicePermission

interface VoicePermissionConfig {
    fun createVoicePermission(voicePermission: VoicePermission)
}