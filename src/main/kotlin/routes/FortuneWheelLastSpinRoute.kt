package com.example.routes

import com.example.data.FortuneWheelLastSpin
import com.example.helpers.FormatHelper.DATE_MONTH_YEAR_WITH_HOUR_MINUT_SECOND
import com.example.helpers.FormatHelper.format
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import kotlinx.coroutines.delay
import java.time.LocalDateTime
import kotlin.random.Random

fun Route.fortuneWheelLastSpinRoute() {
    get("fortuneWheel/lastSpin") {
        delay(2500)
        val randomInt = Random.nextInt(1, 48)
        val lastSpin = LocalDateTime.now().minusHours(randomInt.toLong())
        call.respond(FortuneWheelLastSpin(lastSpin.format(DATE_MONTH_YEAR_WITH_HOUR_MINUT_SECOND)))
    }
}