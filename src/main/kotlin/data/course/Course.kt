package com.example.data.course

import com.example.data.Progress
import kotlinx.serialization.Serializable

@Serializable
data class Course(
    val id: String,
    val name: String,
    val tutorName: String,
    val rate: Double,
    val duration: Int,
    val progress: Progress,
    val tag: String,
    val coverUrl: String,
    val forAdults: Boolean
) {
    companion object {
        fun mock0() = Course(
            id = "0",
            name = "Круговые тренировки",
            tutorName = "Анастасия Леонидовна",
            rate = 4.5,
            duration = 102,
            progress = Progress.Companion.mock0(),
            tag = "Здоровье",
            coverUrl = "https://iili.io/KLGeEua.png",
            forAdults = false
        )

        fun mock1() = Course(
            id = "1",
            name = "Мужские тренировки",
            tutorName = "Анастасия Леонидовна",
            rate = 1.0,
            duration = 11,
            progress = Progress.Companion.mock1(),
            tag = "Здоровье",
            coverUrl = "https://iili.io/KLGeEua.png",
            forAdults = false
        )

        fun mock2() = Course(
            id = "2",
            name = "Водные процедуры",
            tutorName = "Анастасия Леонидовна",
            rate = 4.4,
            duration = 12,
            progress = Progress.Companion.mock2(),
            tag = "Здоровье",
            coverUrl = "https://iili.io/KLGeEua.png",
            forAdults = false
        )
    }
}