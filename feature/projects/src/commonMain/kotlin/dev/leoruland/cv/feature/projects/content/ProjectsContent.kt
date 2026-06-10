package dev.leoruland.cv.feature.projects.content

import dev.leoruland.cv.feature.projects.domain.model.Project

object ProjectsContent {
    val projects: List<Project> = listOf(
        Project(
            name = "Pixolo Passport App",
            company = "apploft. GmbH",
            period = "06.2025 – heute",
            description = "Alleinige Android-Verantwortung für die Neuentwicklung einer App " +
                "zum Erstellen biometrischer Passbilder: Multi-Module-Architektur " +
                "(base/api/features) mit Clean Architecture und MVVM, " +
                "Computer-Vision-Pipeline aus CameraX und ML Kit Face Detection " +
                "für 35-mm-Lens-Capture und Biometrie-Validierung, anschließende " +
                "Bearbeitungsfunktion sowie Warenkorb-, Registrierungs- und " +
                "Print-Flow gegen die apploft API.",
            tags = listOf(
                "Kotlin",
                "Jetpack Compose",
                "CameraX",
                "ML Kit",
                "MVVM",
                "Coroutines",
                "Material 3",
            ),
        ),
        Project(
            name = "Kulturpunkte Hamburg",
            company = "apploft. GmbH",
            period = "2025",
            description = "Feature-Entwicklung und Bugfixing über mehrere Releases.",
            tags = listOf("Kotlin", "Jetpack Compose"),
        ),
        Project(
            name = "C&A Online-Shop",
            company = "apploft. GmbH",
            period = "2022 – 2025",
            description = "Android Online-Shop, internationales Team. Refactoring von MVP auf " +
                "MVVM, Compose Material2 Theming und Design-Updates.",
            tags = listOf("Kotlin", "Jetpack Compose", "Material 3", "MVVM"),
        ),
        Project(
            name = "POCO",
            company = "apploft. GmbH",
            period = "2022 – 2025",
            description = "Android-App des Möbelhauses. Konzept und Umsetzung einer " +
                "überarbeiteten Startseite.",
            tags = listOf("Kotlin", "Jetpack Compose"),
        ),
        Project(
            name = "Mercedes me Service App",
            company = "apploft. GmbH",
            period = "2022 – 2025",
            description = "Android Service-App in MVI, englischsprachiges Team. " +
                "Feature-Entwicklung und Bugfixing.",
            tags = listOf("Kotlin", "Coroutines"),
        ),
        Project(
            name = "Lotto Niedersachsen",
            company = "apploft. GmbH",
            period = "2022 – 2025",
            description = "Android Lotterie-App in MVVM. Implementierung neuer Features " +
                "und Bugfixing.",
            tags = listOf("Kotlin", "MVVM", "Jetpack Compose"),
        ),
        Project(
            name = "Call a Bike",
            company = "Deutsche Bahn Connect GmbH",
            period = "07.2020 – 05.2022",
            description = "Whitelabel-Bikesharing-App in Kotlin und Java nach Scrum. " +
                "Feature-Planung, Refactoring auf MVVM, Umstellung von XML auf Jetpack Compose.",
            tags = listOf("Kotlin", "Jetpack Compose", "MVVM"),
        ),
    )
}
