package dev.leoruland.cv.feature.projects.domain.model

data class Project(
    val name: String,
    val company: String,
    val period: String,
    val description: String,
    val tags: List<String>,
)
