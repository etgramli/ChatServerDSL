package de.htwg.modellgetrieben.dsl.model.channel

import de.htwg.modellgetrieben.dsl.model.permission.Permission

interface Channel {
    val name: String
    val permissions: Permission
}