package dev.leoruland.cv.feature.skills.content

import dev.leoruland.cv.feature.skills.domain.model.Skill
import dev.leoruland.cv.feature.skills.domain.model.SkillGroup

object SkillsContent {
    val skillGroups: List<SkillGroup> = listOf(
        SkillGroup(
            title = "Architektur",
            items = listOf(Skill("Kotlin"), Skill("Coroutines"), Skill("MVVM")),
        ),
        SkillGroup(
            title = "Frameworks & SDKs",
            items = listOf(
                Skill("Jetpack Compose"),
                Skill("Material 3"),
                Skill("CameraX"),
                Skill("ML Kit"),
                Skill("Retrofit"),
                Skill("OkHttp"),
                Skill("Google Maps Compose"),
                Skill("Lottie"),
                Skill("Coil"),
                Skill("ExoPlayer"),
            ),
        ),
        SkillGroup(
            title = "Build, Tracking & Integrationen",
            items = listOf(
                Skill("Gradle Kotlin DSL"),
                Skill("Firebase"),
                Skill("OneSignal"),
                Skill("Health Connect"),
            ),
        ),
    )
}
