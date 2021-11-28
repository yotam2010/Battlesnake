package com.duda.battlesnake.rest

import com.duda.battlesnake.models.GameState
import com.duda.battlesnake.models.Move
import com.duda.battlesnake.models.SnakeConfig
import com.duda.battlesnake.service.GameService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController(val gameService: GameService) {

    @GetMapping("/")
    fun getSnakeConfig() = SnakeConfig("1", "Liat Grinshpun")

    @PostMapping("/start")
    fun startGame(@RequestBody state: GameState) {

    }

    @PostMapping("/move")
    fun move(@RequestBody state: GameState): Move {
        val direction = gameService.move(state)
        return Move(direction, direction.name)
    }

    @PostMapping("/env")
    fun endGame() {

    }
}
