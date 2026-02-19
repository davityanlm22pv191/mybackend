package com.example.helpers

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object FormatHelper {

    const val DATE_MONTH_YEAR_WITH_HOUR_MINUT_SECOND = "dd.MM.yyyy HH:mm:ss"

    // region ==================== Date =====================

    fun LocalDateTime.format(pattern: String): String = format(DateTimeFormatter.ofPattern(pattern))

    @Suppress("unused")
    fun CharSequence.toLocalDate(format: String): LocalDate {
        val formatter = DateTimeFormatter.ofPattern(format)
        return LocalDate.parse(this, formatter)
    }


    // endregion
}