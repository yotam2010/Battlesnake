package com.duda.battlesnake.models

data class Battlesnake(
    val id: String,
    val name: String,
    val health: Int,
    val body: List<Coordinates>,
    val latency: String,
    val head: Coordinates,
    val length: Int,
    val shout: String,
    val squad: String
)

//{
//    "id": "totally-unique-snake-id",
//    "name": "Sneky McSnek Face",
//    "health": 54,
//    "body": [
//    {"x": 0, "y": 0},
//    {"x": 1, "y": 0},
//    {"x": 2, "y": 0}
//    ],
//    "latency": "123",
//    "head": {"x": 0, "y": 0},
//    "length": 3,
//    "shout": "why are we shouting??",
//    "squad": "1"
//}
