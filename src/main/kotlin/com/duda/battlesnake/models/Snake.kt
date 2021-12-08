package com.duda.battlesnake.models

data class Snake(
    val id: String,
    val name: String,
    val health: Int,
    val body: Array<Coordinate>,
    val latency: String,
    val head: Coordinate,
    val length: Int,
    val shot: String,
    val squad: String
) {
}