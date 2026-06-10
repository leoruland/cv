package dev.leoruland.cv.data

data class ExperienceEntry(
    val role: String,
    val company: String?,
    val period: String,
    val description: String?,
    val bullets: List<Bullet>,
)
