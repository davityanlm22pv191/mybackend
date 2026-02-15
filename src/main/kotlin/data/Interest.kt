package com.example.data

import kotlinx.serialization.Serializable

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