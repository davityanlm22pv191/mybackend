package com.example.routes

import com.example.data.mail.MailsResponse
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import kotlinx.coroutines.delay

fun Route.mailsRoute() {
    get("mails") {
        delay(1500)
        call.respond(MailsResponse.mock())
    }
}