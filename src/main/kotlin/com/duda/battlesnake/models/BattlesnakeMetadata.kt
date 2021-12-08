package com.duda.battlesnake.models

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class BattlesnakeMetadata() {

    @Value("\${battlesnake.metadata.apiversion}")
    lateinit var apiVersion: String;

    @Value("\${battlesnake.metadata.author}")
    lateinit var author: String;

    @Value("\${battlesnake.metadata.color}")
    lateinit var color: String;

    @Value("\${battlesnake.metadata.head}")
    lateinit var head: String;

    @Value("\${battlesnake.metadata.tail}")
    lateinit var tail: String;
}