package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class Level(
    val level: Int,
    val currentAmount: Int,
    val target: Int
) {
    companion object {
        fun mock() = Level(
            level = 1,
            currentAmount = 3000,
            target = 5000
        )
    }
}