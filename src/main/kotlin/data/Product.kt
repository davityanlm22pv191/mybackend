package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val productName: String,
    val coverUrl: String,
    val coursesCoverUrls: List<String>,
    val mastersCoverUrls: List<String>,
    val interests: List<Interest>,
    val id: String
) {
    companion object {
        fun mock() = Product(
            productName = "Excel для начинающих",
            coverUrl = "https://iili.io/K8uNkI1.png",
            coursesCoverUrls = listOf(
                "https://iili.io/K8uNkI1.png",
                "https://iili.io/K8uNkI1.png",
                "https://iili.io/K8uNkI1.png"
            ),
            mastersCoverUrls = listOf(
                "https://iili.io/Kkri8V2.png",
                "https://iili.io/Kk4qtK7.png",
                "https://iili.io/KkriSPS.png"
            ),
            interests = Interest.mockList(),
            id = "1"
        )
    }
}
