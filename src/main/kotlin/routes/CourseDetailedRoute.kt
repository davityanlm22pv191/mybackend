package com.example.routes

import com.example.data.course.CourseDetailed
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import kotlinx.coroutines.delay

fun Route.courseDetailedRoute() {
    get("/courseDetailed/{courseId}") {
        delay(1500)
        call.parameters["courseId"]?.let { id ->
            call.respond(CourseDetailed.MOCK.copy(id = id))
        }
    }
}