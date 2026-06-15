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
                Skill("MVP"),
                Skill("Clean Architecture"),
                Skill("Multi-Module Architecture"),
                Skill("Coroutines"),
                Skill("Kotlin Flow"),
                Skill("RxJava"),
                Skill("Dagger"),
            ),
        ),
        SkillGroup(
            title = "UI / UX",
            items = listOf(
                Skill("Material Design"),
                Skill("View System (XML)"),
                Skill("Jetpack Compose"),
                Skill("Compose Navigation"),
                Skill("Lottie"),
                Skill("Coil"),
            ),
        ),
        SkillGroup(
            title = "Multiplatform",
            items = listOf(
                Skill("Compose Multiplatform"),
                Skill("Flutter"),
                Skill("Riverpod"),
            ),
        ),
        SkillGroup(
            title = "Frameworks, SDKs & Daten",
            items = listOf(
                Skill("CameraX"),
                Skill("ML Kit"),
                Skill("ExoPlayer"),
                Skill("Health Connect"),
                Skill("Google Maps"),
                Skill("Retrofit"),
                Skill("OkHttp"),
                Skill("DataStore"),
                Skill("Auth0"),
                Skill("Gigya"),
                Skill("Google Pay"),
                Skill("Firebase"),
            ),
        ),
        SkillGroup(
            title = "Qualität & Accessibility",
            items = listOf(
                Skill("JUnit"),
                Skill("Espresso"),
                Skill("MockK"),
                Skill("Accessibility Audit"),
                Skill("TalkBack"),
            ),
        ),
        SkillGroup(
            title = "Analytics, Tracking & Consent",
            items = listOf(
                Skill("Crashlytics"),
                Skill("Adjust"),
                Skill("Facebook SDK"),
                Skill("Matomo"),
                Skill("OneSignal"),
                Skill("Usercentrics"),
            ),
        ),
        SkillGroup(
            title = "Build & CI",
            items = listOf(
                Skill("Gradle Kotlin DSL"),
                Skill("GitHub Actions"),
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
