package com.duda.battlesnake.models

data class Board(
    val height: Int,
    val width: Int,
    val food: Array<Coordinate>,
    val hazzards: Array<Coordinate>,
    val snakes: Array<Snake>
) {
}