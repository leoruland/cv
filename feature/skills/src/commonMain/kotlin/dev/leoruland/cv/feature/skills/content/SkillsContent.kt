package dev.leoruland.cv.feature.skills.content

import dev.leoruland.cv.feature.skills.domain.model.Skill
import dev.leoruland.cv.feature.skills.domain.model.SkillGroup

object SkillsContent {
    val skillGroups: List<SkillGroup> = listOf(
        SkillGroup(
            title = "Sprachen",
            items = listOf(
                Skill("Kotlin"),
                Skill("Java"),
                Skill("Dart"),
            ),
        ),
        SkillGroup(
            title = "Architektur & Patterns",
            items = listOf(
                Skill("MVVM"),
                Skill("MVI"),
                Skill("Clean Architecture"),
                Skill("Multi-Module Architecture"),
                Skill("Coroutines"),
                Skill("Flow"),
                Skill("RxJava"),
                Skill("Dagger"),
            ),
        ),
        SkillGroup(
            title = "UI & Compose",
            items = listOf(
                Skill("Jetpack Compose"),
                Skill("Compose Navigation"),
                Skill("Material Design"),
                Skill("View System (XML)"),
                Skill("Compose Multiplatform"),
            ),
        ),
        SkillGroup(
            title = "Frameworks & SDKs",
            items = listOf(
                Skill("CameraX"),
                Skill("ML Kit"),
                Skill("ExoPlayer"),
                Skill("Health Connect"),
                Skill("Google Maps"),
                Skill("Lottie"),
                Skill("Coil"),
                Skill("Timber"),
            ),
        ),
        SkillGroup(
            title = "Netzwerk & Daten",
            items = listOf(
                Skill("Retrofit"),
                Skill("OkHttp"),
                Skill("Gson"),
                Skill("DataStore"),
            ),
        ),
        SkillGroup(
            title = "Multiplatform",
            items = listOf(
                Skill("Flutter"),
                Skill("Riverpod"),
            ),
        ),
        SkillGroup(
            title = "Testing & Qualität",
            items = listOf(
                Skill("JUnit"),
                Skill("Espresso"),
                Skill("MockK"),
                Skill("Detekt"),
            ),
        ),
        SkillGroup(
            title = "Accessibility",
            items = listOf(
                Skill("Audit"),
                Skill("TalkBack"),
                Skill("Navigation"),
                Skill("Dynamic Type"),
            ),
        ),
        SkillGroup(
            title = "Auth & Payment",
            items = listOf(
                Skill("Auth0"),
                Skill("Gigya"),
                Skill("Google Pay"),
                Skill("PayPal"),
            ),
        ),
        SkillGroup(
            title = "Build, Tracking & Integrationen",
            items = listOf(
                Skill("Gradle Kotlin DSL"),
                Skill("GitHub Actions"),
                Skill("Firebase"),
                Skill("Crashlytics"),
                Skill("Adjust"),
                Skill("Facebook SDK"),
                Skill("Matomo"),
                Skill("OneSignal"),
                Skill("Usercentrics"),
            ),
        ),
//        SkillGroup(
//            title = "Engagement",
//            items = listOf(
//                Skill("Volunteering"),
//                Skill("Event-Organisation"),
//            ),
//        ),
//        SkillGroup(
//            title = "Personal interests",
//            items = listOf(
//                Skill("Ancient cultural history"),
//                Skill("Board and Role Playing Games"),
//                Skill("Crossfit"),
//            ),
//        ),
    )
}
