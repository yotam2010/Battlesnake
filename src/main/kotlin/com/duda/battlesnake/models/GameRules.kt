package com.duda.battlesnake.models

data class Game(val id: String, val ruleset: Ruleset, val timeout: Int, val source: String? = null)

enum class GameMode {
    standard, solo, royale, squad, constrictor
}

data class Ruleset(val name: GameMode, val version: String, val settings: RulesetSettings? = null)

data class RulesetSettings(
    val foodSpawnChance: Int,
    val minimumFood: Int,
    val hazardDamagePerTurn: Int,
    val royale: RoyaleSettings,
    val squad: SquadSettings
)

data class SquadSettings(
    val allowBodyCollisions: Boolean,
    val sharedElimination: Boolean,
    val sharedHealth: Boolean,
    val sharedLength: Boolean,
)

data class RoyaleSettings(val shrinkEveryNTurns: Int)
