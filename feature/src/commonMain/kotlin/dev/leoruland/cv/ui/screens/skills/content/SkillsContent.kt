package dev.leoruland.cv.ui.screens.skills.content

import dev.leoruland.cv.data.SkillGroup

object SkillsContent {
    val skillGroups: List<SkillGroup> = listOf(
        SkillGroup(
            title = "Architektur",
            items = listOf("Kotlin", "Coroutines", "MVVM"),
        ),
        SkillGroup(
            title = "Frameworks & SDKs",
            items = listOf(
                "Jetpack Compose",
                "Material 3",
                "CameraX",
                "ML Kit",
                "Retrofit",
                "OkHttp",
                "Google Maps Compose",
                "Lottie",
                "Coil",
                "ExoPlayer",
            ),
        ),
        SkillGroup(
            title = "Build, Tracking & Integrationen",
            items = listOf("Gradle Kotlin DSL", "Firebase", "OneSignal", "Health Connect"),
        ),
    )
}
