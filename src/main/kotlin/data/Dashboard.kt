package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class Dashboard(
    val title: String,
    val coverUrl: String,
) {
    companion object {
        val MOCK: Dashboard
            get() = Dashboard(title = "Расчет матрицы", coverUrl = "")
    }
}