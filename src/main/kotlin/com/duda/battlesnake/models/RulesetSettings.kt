package com.duda.battlesnake.models

data class RulesetSettings(val foodSpawnChance: Int, val minimumFood: Int, val hazardDamagePerTurn: Int,
                           val royale: Royale, val squad: Squad) {
}

data class Royale(val shrinkEveryNTurns: Int)

data class Squad(val allowBodyCollisions: Boolean, val sharedElimination: Boolean,
                 val sharedHealth: Boolean, val sharedLength: Boolean)