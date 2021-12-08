package com.duda.battlesnake

import com.duda.battlesnake.models.*
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class BattlesnakeController(private val battlesnakeMetadata: BattlesnakeMetadata) {

    val gameMap: MutableMap<String, Game> = hashMapOf()

    @GetMapping
    fun getBattlesnakeMetadata(): ResponseEntity<BattlesnakeMetadata> {
        return ResponseEntity.ok(battlesnakeMetadata);
    }

    @PostMapping("/start")
    fun start(@RequestBody game: Game): ResponseEntity<Void> {
        gameMap.put(game.id, game);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/end")
    fun end(@RequestBody moveRequest: MoveRequest): ResponseEntity<Void> {
        gameMap.remove(moveRequest.game.id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/move")
    fun move(@RequestBody moveRequest: MoveRequest): ResponseEntity<MoveResponse> {
        val moveList: MutableList<Move> = mutableListOf();
        moveList.add(Move.DOWN);
        moveList.add(Move.UP);
        moveList.add(Move.LEFT);
        moveList.add(Move.RIGHT);
        return ResponseEntity.ok(MoveResponse(move = moveList.get(Random(5).nextInt(4))));
    }
}