package com.example.data

data class Dashboard(
    val title: String,
    val coverUrl: String,
) {
    companion object {
        val MOCK: Dashboard
            get() = Dashboard(title = "Расчет матрицы", coverUrl = "")
    }
}