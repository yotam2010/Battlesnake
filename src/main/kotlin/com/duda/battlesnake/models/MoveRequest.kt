package com.duda.battlesnake.models

class MoveRequest(val game: Game, val turn: Int, val board: Board, val you : Snake) {
}