package de.htwg.modellgetrieben.dsl.channel

import de.htwg.modellgetrieben.dsl.permission.Permission

interface Channel {
    val name: String
    val permissions: List<Permission>
}