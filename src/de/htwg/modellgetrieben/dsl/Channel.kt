package de.htwg.modellgetrieben.dsl

interface Channel {
    var name: String
    var permissions: List<Permission>
}