package com.example.data.mail

import kotlinx.serialization.Serializable

@Serializable
data class Mail(
    val id: Int,
    val title: String,
    val description: String,
    val type: String,
    val isViewed: Boolean
) {
    companion object {
        fun mock1() = Mail(
            id = 1,
            title = "Вам подарок",
            description = "У вас один новый подарок",
            type = "GIFT",
            isViewed = false
        )

        fun mock2() = Mail(
            id = 2,
            title = "Вам подарок",
            description = "У вас один новый подарок",
            type = "GIFT",
            isViewed = false
        )

        fun mock3() = Mail(
            id = 3,
            title = "У вас новое уведомление",
            description = "Новое видео к курсу уже доступно",
            type = "NOTIFICATION",
            isViewed = false
        )

        fun mock4() = Mail(
            id = 4,
            title = "Вам ещё подарок",
            description = "У вас один новый подарок",
            type = "GIFT",
            isViewed = true
        )

        fun mock5() = Mail(
            id = 5,
            title = "У вас новое уведомление",
            description = "Срок задания подходит к концу",
            type = "NOTIFICATION",
            isViewed = true
        )
    }
}
