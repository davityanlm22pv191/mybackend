package com.example.routes

import com.example.data.course.CoursesResponse
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import kotlinx.coroutines.delay

fun Route.myCourses() {
    get("myCourses") {
        delay(2000)
        call.respond(CoursesResponse.mock())
    }
}