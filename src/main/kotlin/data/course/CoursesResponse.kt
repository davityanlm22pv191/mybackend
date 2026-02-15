package com.example.data.course

import kotlinx.serialization.Serializable

@Serializable
data class CoursesResponse(
    val courses: List<Course>
) {
    companion object {
        fun mock() = CoursesResponse(
            courses = listOf(
                Course.mock0(),
                Course.mock1(),
                Course.mock2()
            )
        )
    }
}