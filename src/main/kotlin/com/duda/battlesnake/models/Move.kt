package com.duda.battlesnake.models

data class MoveResponse(val move: Move, val shout: String? = null)

enum class Move {
    UP,
    DOWN,
    RIGHT,
    LEFT;

    override fun toString(): String {
        return super.toString().lowercase();
    }
}