package dev.leoruland.cv.data

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

data class EducationEntry(
    val degree: String,
    val institution: String,
    val period: String,
)

data class SkillGroup(
    val title: String,
    val items: List<String>,
)

data class ExperienceEntry(
    val role: String,
    val company: String?,
    val period: String,
    val description: String?,
    val bullets: List<Bullet>,
)

data class Bullet(
    val highlight: String?,
    val text: String,
)

object CvData {
    val personal = Personal(
        name = "Leonardo Ruland",
        role = "Software Engineer Mobile",
        tagline = "Android Engineer mit über 5 Jahren Kotlin- und Compose-Praxis. " +
            "Von Architektur-Refactorings über BFSG-Accessibility bis zur kompletten " +
            "Neuentwicklung produktiver Apps mit Millionen-Reichweite – etwa für " +
            "C&A, Mercedes und Deutsche Bahn.",
        address = "Arndtstraße 10, 10965 Berlin",
        phone = "+49 176 712 166 10",
        email = "leoruland@web.de",
        languages = listOf("Deutsch (Muttersprache)", "Englisch (C1)"),
        education = listOf(
            EducationEntry(
                degree = "B.Sc. Angewandte Informatik",
                institution = "HTW Berlin",
                period = "2016 – 2022",
            ),
            EducationEntry(
                degree = "B.A. Klassische Archäologie / Religionswissenschaft",
                institution = "Uni Heidelberg",
                period = "Abschluss 2016",
            ),
        ),
    )

    val skillGroups = listOf(
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

    val experience = listOf(
        ExperienceEntry(
            role = "Software Engineer Mobile",
            company = "apploft. GmbH",
            period = "06.2025 – heute",
            description = "End-to-End-Verantwortung für die Pixolo Passport App – " +
                "von Architektur bis Release. Daneben App-übergreifende Initiativen " +
                "in Accessibility und Tooling.",
            bullets = listOf(
                Bullet(
                    "Pixolo Passport App",
                    "Alleinige Android-Verantwortung für die Neuentwicklung einer App " +
                        "zum Erstellen biometrischer Passbilder: Multi-Module-Architektur " +
                        "(base/api/features) mit Clean Architecture und MVVM, " +
                        "Computer-Vision-Pipeline aus CameraX und ML Kit Face Detection " +
                        "für 35-mm-Lens-Capture und Biometrie-Validierung, anschließende " +
                        "Bearbeitungsfunktion sowie Warenkorb-, Registrierungs- und " +
                        "Print-Flow gegen die apploft API.",
                ),
                Bullet(
                    "Kulturpunkte Hamburg",
                    "Feature-Entwicklung und Bugfixing über mehrere Releases.",
                ),
                Bullet("BFSG-Anpassungen", "über mehrere betreute Apps."),
                Bullet(
                    "Repository-Migration",
                    "von Bitbucket nach GitHub inkl. Anpassung der Build-Pipelines.",
                ),
            ),
        ),
        ExperienceEntry(
            role = "Junior Software Engineer",
            company = "apploft. GmbH",
            period = "06.2022 – 05.2025",
            description = "Android-Entwicklung für diverse Kunden-Apps und hauseigene " +
                "Komponenten-Libraries. Feature-Entwicklung, Bugfixing und Wartung mit " +
                "Abstimmung zu iOS-, Backend- und UX-Kolleg:innen.",
            bullets = listOf(
                Bullet(
                    "C&A",
                    "Android Online-Shop, internationales Team. Refactoring von MVP auf " +
                        "MVVM, Compose Material2 Theming und Design-Updates.",
                ),
                Bullet(
                    "POCO",
                    "Android-App des Möbelhauses. Konzept und Umsetzung einer " +
                        "überarbeiteten Startseite.",
                ),
                Bullet(
                    "Mercedes me Service App",
                    "Android Service-App in MVI, englischsprachiges Team. " +
                        "Feature-Entwicklung und Bugfixing.",
                ),
                Bullet(
                    "Lotto Niedersachsen",
                    "Android Lotterie-App in MVVM. Implementierung neuer Features " +
                        "und Bugfixing.",
                ),
            ),
        ),
        ExperienceEntry(
            role = "Werkstudent Android-Entwicklung",
            company = "Deutsche Bahn Connect GmbH",
            period = "07.2020 – 05.2022",
            description = "Entwicklung und Wartung der „Call a Bike\"-Whitelabel-App " +
                "in Kotlin und Java nach Scrum. Feature-Planung, Refactoring auf MVVM, " +
                "Umstellung von XML auf Jetpack Compose.",
            bullets = emptyList(),
        ),
        ExperienceEntry(
            role = "Frühere Stationen",
            company = null,
            period = "2018 – 2020",
            description = null,
            bullets = listOf(
                Bullet(
                    "Scopeland Technology GmbH",
                    "Werkstudent Softwareentwicklung (10.2019 – 06.2020)",
                ),
                Bullet(
                    "SatoshiPay GmbH",
                    "Werkstudent QA (05.2018 – 12.2018)",
                ),
            ),
        ),
    )
}
