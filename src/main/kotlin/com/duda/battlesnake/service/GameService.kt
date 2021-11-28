package com.duda.battlesnake.service

import com.duda.battlesnake.models.Coordinates
import com.duda.battlesnake.models.Direction
import com.duda.battlesnake.models.GameState
import org.springframework.stereotype.Service

@Service
class GameService {

    fun move(state: GameState): Direction {
        val head = state.you!!.head
        return getDirection(head, findClosestFood(head, state.board!!.food))
    }

    private fun findClosestFood(head: Coordinates, food: List<Coordinates>): Coordinates {
        var closest = Coordinates(Int.MAX_VALUE, Int.MAX_VALUE)
        var distance: Int = Int.MAX_VALUE
        for (point in food) {
            val dist = head.distance(point)
            if (dist < distance) {
                closest = point
                distance = dist
            }
        }
        return closest
    }

    private fun getDirection(head: Coordinates, point: Coordinates): Direction {
        if (head.x < point.x) {
            return Direction.right
        }
        if (head.x > point.x) {
            return Direction.left
        }
        if (head.y < point.y) {
            return Direction.up
        }
        if (head.y > point.y) {
            return Direction.down
        }
        return Direction.up // default - shouldn't get here
    }
}
