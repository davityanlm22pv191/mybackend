package com.example.routes

import com.example.data.Product
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.onboardingRoute() {
    get("/onboarding") {
        call.respond(Product.mock())
    }
}