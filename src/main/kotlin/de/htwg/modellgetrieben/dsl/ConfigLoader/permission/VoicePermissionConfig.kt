package de.htwg.modellgetrieben.dsl.ConfigLoader.permission

import de.htwg.modellgetrieben.dsl.model.permission.VoicePermission

interface VoicePermissionConfig {
    fun createVoicePermission(voicePermission: VoicePermission)
}