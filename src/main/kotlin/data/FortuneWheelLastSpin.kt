package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class FortuneWheelLastSpin(
    val lastSpinTime: String
) {
    companion object {
        fun mock() = FortuneWheelLastSpin("29.10.2025 08:00:00")
    }
}