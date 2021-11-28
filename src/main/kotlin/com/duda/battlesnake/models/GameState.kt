package com.duda.battlesnake.models

import kotlin.math.abs

data class GameState(val game: Game?, val turn: Int?, val board: Board?, val you: Battlesnake?)

enum class Direction {
    up, down, left, right
}

data class Move(val move: Direction, val shout: String? = null)

data class Coordinates(val x: Int, val y: Int) {

    fun distance(other: Coordinates): Int {
        return abs(x - other.x) + abs(y - other.y)
    }
}

data class Board(
    val height: Int,
    val width: Int,
    val food: List<Coordinates>,
    val hazards: List<Coordinates>,
    val snakes: List<Battlesnake>
)
