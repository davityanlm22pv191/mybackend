package com.example

import com.example.data.CourseDetailed
import com.example.data.MailsResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class CoursesResponse(
    val courses: List<Course>
) {
    companion object {
        fun mock() = CoursesResponse(
            courses = listOf(
                Course.mock0(),
                Course.mock1(),
                Course.mock2()
            )
        )
    }
}

@Serializable
data class Course(
    val id: String,
    val name: String,
    val tutorName: String,
    val rate: Double,
    val duration: Int,
    val progress: Progress,
    val tag: String,
    val coverUrl: String,
    val forAdults: Boolean
) {
    companion object {
        fun mock0() = Course(
            id = "0",
            name = "Круговые тренировки",
            tutorName = "Анастасия Леонидовна",
            rate = 4.5,
            duration = 102,
            progress = Progress.mock0(),
            tag = "Здоровье",
            coverUrl = "https://iili.io/KLGeEua.png",
            forAdults = false
        )

        fun mock1() = Course(
            id = "1",
            name = "Мужские тренировки",
            tutorName = "Анастасия Леонидовна",
            rate = 1.0,
            duration = 11,
            progress = Progress.mock1(),
            tag = "Здоровье",
            coverUrl = "https://iili.io/KLGeEua.png",
            forAdults = false
        )

        fun mock2() = Course(
            id = "2",
            name = "Водные процедуры",
            tutorName = "Анастасия Леонидовна",
            rate = 4.4,
            duration = 12,
            progress = Progress.mock2(),
            tag = "Здоровье",
            coverUrl = "https://iili.io/KLGeEua.png",
            forAdults = false
        )
    }
}

@Serializable
data class Progress(
    val current: Int,
    val target: Int
) {
    companion object {
        fun mock0() = Progress(current = 1, target = 21)
        fun mock1() = Progress(current = 10, target = 21)
        fun mock2() = Progress(current = 1, target = 21)
    }
}

@Serializable
data class FortuneWheelLastSpin(
    val lastSpinTime: String
) {
    companion object {
        fun mock() = FortuneWheelLastSpin("29.10.2025 08:00:00")
    }
}

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

@Serializable
data class Level(
    val level: Int,
    val currentAmount: Int,
    val target: Int
) {
    companion object {
        fun mock() = Level(
            level = 1,
            currentAmount = 3000,
            target = 5000
        )
    }
}

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

@Serializable
data class Interest(
    val id: Int,
    val name: String
) {
    companion object {
        fun mockList() = listOf(
            Interest(1, "Питание"),
            Interest(2, "Бизнес"),
            Interest(3, "Для мужчин"),
            Interest(4, "Спорт"),
            Interest(5, "Красота"),
            Interest(6, "IT"),
            Interest(7, "Саморазвитие"),
            Interest(8, "Дизайн"),
            Interest(9, "Для женщин"),
            Interest(10, "Продажи"),
            Interest(11, "Астрология"),
            Interest(12, "Блогинг"),
            Interest(13, "Веб-дизайн"),
            Interest(14, "Криптовалюты"),
            Interest(15, "Маркетинг"),
            Interest(16, "Эзотерика"),
            Interest(17, "Монтаж видео"),
            Interest(18, "Нейросети"),
            Interest(19, "Психология"),
            Interest(20, "Профессии"),
            Interest(21, "Финансы"),
            Interest(22, "Инвестиции"),
            Interest(23, "Фотография"),
            Interest(24, "Музыка"),
            Interest(25, "Кулинария"),
            Interest(26, "Путешествия"),
            Interest(27, "Искусство"),
            Interest(28, "Кино"),
            Interest(29, "Образование"),
            Interest(30, "Фриланс"),
            Interest(31, "Наука"),
            Interest(32, "Здоровье"),
            Interest(33, "Мода"),
            Interest(34, "Ремонт и строительство"),
            Interest(35, "Авто"),
            Interest(36, "Игры"),
            Interest(37, "Юриспруденция"),
            Interest(38, "Педагогика"),
            Interest(39, "Копирайтинг"),
            Interest(40, "Экология")
        )
    }
}

fun Application.configureRouting() {
    routing {
        // Пример GET запроса для профиля
        get("/profile/short") {
            call.respond(UserProfileShort.mock())
        }

        get("/onboarding") {
            call.respond(Product.mock())
        }
        get("fortuneWheel/lastSpin") {
            call.respond(FortuneWheelLastSpin.mock())
        }
        get("myCourses") {
            call.respond(CoursesResponse.mock())
        }
        get("speciallyForYou") {
            call.respond(CoursesResponse.mock())
        }
        get("mails") {
            call.respond(MailsResponse.mock())
        }
        get("/courseDetailed/{courseId}") {
            // Извлекаем параметр courseId из URL
            val courseId = call.parameters["courseId"]!!
            call.respond(CourseDetailed.MOCK.copy(id = courseId))
        }
    }
}
