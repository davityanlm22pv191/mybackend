package com.example.data.profile

import com.example.data.Level
import kotlinx.serialization.Serializable

@Serializable
data class UserProfileShort(
    val id: String,
    val userName: String,
    val level: Level,
    val unreadMessageCount: Int,
    val profileThumbUrl: String
) {
    companion object {
        fun mock() = UserProfileShort(
            id = "1",
            userName = "Валерия",
            level = Level.mock(),
            unreadMessageCount = 3,
            profileThumbUrl = "https://iili.io/K4WLI4a.png",
        )
    }
}