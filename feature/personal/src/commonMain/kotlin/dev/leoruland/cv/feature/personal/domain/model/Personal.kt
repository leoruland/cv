package dev.leoruland.cv.feature.personal.domain.model

data class Personal(
    val name: String,
    val role: String,
    val tagline: String,
    val address: String,
    val phone: String,
    val email: String,
    val languages: List<String>,
    val education: List<EducationEntry>,
)
