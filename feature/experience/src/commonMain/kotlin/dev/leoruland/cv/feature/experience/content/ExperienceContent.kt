package dev.leoruland.cv.feature.experience.content

import dev.leoruland.cv.feature.experience.domain.model.Bullet
import dev.leoruland.cv.feature.experience.domain.model.ExperienceEntry

object ExperienceContent {
    val experience: List<ExperienceEntry> = listOf(
        ExperienceEntry(
            role = "Software Engineer Mobile",
            company = "apploft. GmbH",
            period = "06.2025 – heute",
            description = "End-to-End-Verantwortung für die Pixolo Passport App — von " +
                "Multi-Module-Architektur über CameraX/ML-Kit-Pipeline bis Release. Parallel " +
                "App-übergreifende Initiativen in Accessibility (BFSG), Tooling und " +
                "Plattform-Modernisierung; Beiträge an apploft-internen Compose-Libraries und " +
                "CI-Workflows.",
            bullets = listOf(
                Bullet(
                    "BFSG-Konformität",
                    "Audits, TalkBack-Optimierungen und Layout-Fixes über mehrere betreute Apps.",
                ),
                Bullet(
                    "Repository-Migration",
                    "von Bitbucket nach GitHub inkl. Build-Pipelines.",
                ),
                Bullet(
                    "apploft Android Libraries",
                    "Beiträge an Onboarding, Window-Insets und BOM-Dokumentation.",
                ),
//                Bullet(
//                    "Tech-Stack-Bandbreite",
//                    "Sprachen: Kotlin, Java. UI: Jetpack Compose, Material Design, " +
//                        "Compose Navigation, View System (XML). Architektur: MVVM, " +
//                        "Clean Architecture, Multi-Module-Setups; Coroutines, Flow. " +
//                        "Netzwerk & Daten: Retrofit, OkHttp, Gson, DataStore. SDKs: CameraX, " +
//                        "ML Kit, ExoPlayer, Health Connect, Google Maps, Lottie, Coil, Timber. " +
//                        "Tracking & Integrationen: Firebase, Crashlytics, OneSignal, Matomo, " +
//                        "Usercentrics. Auth & Payment: Auth0, Gigya. Build & CI: " +
//                        "Gradle Kotlin DSL, GitHub Actions. Accessibility: Audits und " +
//                        "TalkBack-Optimierungen.",
//                ),
            ),
        ),
        ExperienceEntry(
            role = "Junior Software Engineer",
            company = "apploft. GmbH",
            period = "06.2022 – 05.2025",
            description = "Android- und Flutter-Entwicklung für ein breites Kunden-Portfolio " +
                "(E-Commerce, Health, Lottery, Sport, Touristik) sowie für hauseigene " +
                "Komponenten-Libraries. Arbeit in agilen Teams (Scrum/Kanban) mit enger " +
                "Abstimmung zu iOS-, Backend- und UX-Kolleg:innen. Über drei Jahre " +
                "Architektur-Refactorings von MVP/MVI auf MVVM, Migration von XML-Views auf " +
                "Jetpack Compose und Aufbau modularer Feature-Strukturen.",
            bullets = listOf(
                Bullet(
                    "Feature-Entwicklung",
                    "Eigenverantwortliche Umsetzung neuer Funktionalitäten quer durch das " +
                        "Kunden-Portfolio, von Google-Pay-Integration und Shop-Flows (POCO) " +
                        "über Receipt-Scan und Kundenkarten-Capture (Lotto Niedersachsen) " +
                        "bis zu Onboarding-, Tracking- und Consent-Flows (aidFIVE, Mercedes me, " +
                        "Bijou Brigitte).",
                ),
                Bullet(
                    "Bugfixing",
                    "Crash-Analyse über Firebase Crashlytics, gezielte Fixes in komplexen " +
                        "Bestands-Codebasen (Java/Kotlin-Mix, Multi-Module) und Begleitung über " +
                        "mehrere Release-Zyklen, von Layout- und Threading-Issues bis zu " +
                        "Lifecycle- und Permissions-Bugs.",
                ),
                Bullet(
                    "Architektur-Refactorings",
                    "Von MVP/MVI nach MVVM mit Compose-Migration in Bestands-Apps wie C&A und Mercedes me.",
                ),
                Bullet(
                    "Internationale Teams",
                    "englisch- und deutschsprachige Abstimmung über mehrere Kundenprojekte.",
                ),
//                Bullet(
//                    "Tech-Stack-Bandbreite",
//                    "Sprachen: Kotlin, Java, Dart. UI: Jetpack Compose, Material Design, " +
//                        "View System (XML), Flutter mit Riverpod. Architektur: MVVM, MVI, " +
//                        "Clean Architecture, Multi-Module-Setups; Coroutines, Flow, RxJava; " +
//                        "Dagger. Netzwerk: Retrofit, OkHttp. SDKs: CameraX, ML Kit, " +
//                        "Google Maps, Lottie, Coil. Tracking & Integrationen: Firebase, " +
//                        "Crashlytics, Matomo, Adjust, Facebook SDK, OneSignal, Usercentrics. " +
//                        "Auth & Payment: Auth0, Gigya. Tooling: Compose Navigation, " +
//                        "Gradle Kotlin DSL, Detekt, Timber.",
//                ),
            ),
        ),
        ExperienceEntry(
            role = "Werkstudent Android-Entwicklung",
            company = "Deutsche Bahn Connect GmbH",
            period = "07.2020 – 05.2022",
            description = "Entwicklung, Wartung und Bugfixing der „Call a Bike\"-Whitelabel-App " +
                "und ihrer Flavors in Kotlin und Java über den gesamten Lifecycle. " +
                "Feature-Planung und Aufwandsschätzung; Abstimmung mit Backend-, UX- und " +
                "Produkt-Design-Teams in cross-funtionalen Teams." +
                "Layout-Entwicklung in Jetpack Compose und XML-Views; Refactoring der " +
                "bestehenden Architektur auf MVVM.",
            bullets = listOf(
                Bullet(
                    "Build & Deploy",
                    "Unterstützung der Pipelines via Gradle und Azure DevOps.",
                ),
//                Bullet(
//                    "Tech-Stack",
//                    "Integration von Google Maps SDK, Concurrency mit Coroutines, DI mit Koin, Tests mit JUnit4, Robolectric, " +
//                        "Espresso/Kakao und Pact.",
//                ),
            ),
        ),
        ExperienceEntry(
            role = "Frühere Stationen",
            company = null,
            period = "2015 – 2020",
            description = null,
            bullets = listOf(
                Bullet(
                    "Scopeland Technology GmbH",
                    "Werkstudent Low-Code-Entwicklung (10.2019 – 06.2020): Security-Checks nach " +
                        "OWASP und Accessibility-Audits generierter Apps.",
                ),
                Bullet(
                    "SatoshiPay GmbH",
                    "Werkstudent QA Engineering (05.2018 – 12.2018): Aufbau von QA-Umgebungen, " +
                        "kontinuierliche Tests und Issue-Reporting an Stakeholder.",
                ),
                Bullet(
                    "Archäologiebüro ABD-Dressler, Berlin",
                    "Freelance-Grabungshelfer (10.2015 – 09.2016): Mitarbeit an Grabungen, " +
                        "Funddokumentation und Aufbereitung von Artefakten.",
                ),
            ),
        ),
    )
}
