package com.duda.battlesnake.models

data class SnakeConfig(
    val apiversion: String,
    val author: String? = null,
    val color: String? = null,
    val head: String? = null,
    val tail: String? = null,
    val version: String? = null
)

//"apiversion" to "1",
//"author" to "Liat Grinshpun",
//"color" to "#888888",
//"head" to "default",
//"tail" to "default",
//"version" to "0.0.1-beta"
