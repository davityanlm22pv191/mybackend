package com.example

import com.example.routes.courseDetailedRoute
import com.example.routes.fortuneWheelLastSpinRoute
import com.example.routes.mailsRoute
import com.example.routes.myCourses
import com.example.routes.onboardingRoute
import com.example.routes.profileShortRoute
import com.example.routes.speciallyForYou
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        profileShortRoute()
        onboardingRoute()
        fortuneWheelLastSpinRoute()
        myCourses()
        speciallyForYou()
        mailsRoute()
        courseDetailedRoute()
    }
}
