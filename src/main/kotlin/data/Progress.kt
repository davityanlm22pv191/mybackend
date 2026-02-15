package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class Progress(
    val current: Int,
    val target: Int
) {
    companion object {
        fun mock0() = Progress(current = 1, target = 21)
        fun mock1() = Progress(current = 10, target = 21)
        fun mock2() = Progress(current = 1, target = 21)
    }
}