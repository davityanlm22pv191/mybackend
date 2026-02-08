package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class MailsResponse(
    val items: List<Mail>
) {
    companion object {
        fun mock() = MailsResponse(
            items = listOf(
                Mail.mock1(),
                Mail.mock2(),
                Mail.mock3(),
                Mail.mock4(),
                Mail.mock5()
            )
        )
    }
}
