package com.example

import com.example.data.course.CourseDetailed
import com.example.data.course.CoursesResponse
import com.example.data.FortuneWheelLastSpin
import com.example.data.mail.MailsResponse
import com.example.data.Product
import com.example.data.profile.UserProfileShort
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.delay

fun Application.configureRouting() {
    routing {
        get("/profile/short") {
            delay(2000)
            call.respond(UserProfileShort.mock())
        }

        get("/onboarding") {
            call.respond(Product.mock())
        }
        get("fortuneWheel/lastSpin") {
            delay(2500)
            call.respond(FortuneWheelLastSpin.mock())
        }
        get("myCourses") {
            delay(2000)
            call.respond(CoursesResponse.mock())
        }
        get("speciallyForYou") {
            delay(1000)
            call.respond(CoursesResponse.mock())
        }
        get("mails") {
            delay(1500)
            call.respond(MailsResponse.mock())
        }
        get("/courseDetailed/{courseId}") {
            delay(1500)
            call.parameters["courseId"]?.let { id ->
                call.respond(CourseDetailed.MOCK.copy(id = id))
            }
        }
    }
}
