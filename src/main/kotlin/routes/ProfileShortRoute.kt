package com.example.routes

import com.example.data.profile.UserProfileShort
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import kotlinx.coroutines.delay

fun Route.profileShortRoute() {
    get("/profile/short") {
        delay(2000)
        call.respond(UserProfileShort.mock())
    }
}