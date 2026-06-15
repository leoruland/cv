package dev.leoruland.cv.feature.projects.content

import dev.leoruland.cv.feature.projects.domain.model.Project

object ProjectsContent {
    val projects: List<Project> = listOf(
        Project(
            name = "Pixolo Passbild App",
            company = "apploft. GmbH",
            period = "06.2025 – heute",
            description = "B2B-App für biometrische Passbilder. Alleinige Android-Verantwortung: " +
                    "Multi-Module-Architektur, CameraX/ML-Kit-Pipeline für 35-mm-Lens-Capture und " +
                    "Face Detection, Bearbeitungs-, Warenkorb- und Print-Flow gegen die apploft API.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design",
                "MVVM", "Clean Architecture", "Multi-Module Architecture",
                "Coroutines", "Kotlin Flow",
                "CameraX", "ML Kit", "Retrofit", "OkHttp", "DataStore",
                "Firebase", "Lottie", "Coil",
            ),
        ),
        Project(
            name = "POCO Store App",
            company = "apploft. GmbH",
            period = "03.2024 – 12.2025",
            description = "Android-App des Möbelhauses POCO. Google-Pay-Integration, " +
                    "Shop-Toolbar, Offers-Search und Feature-Flag-Setup; laufende Feature-Arbeit " +
                    "in gemischtem Kotlin/Java-Code.",
            tags = listOf(
                "Kotlin", "Java", "Jetpack Compose", "Compose Navigation", "Material Design", "MVVM",
                "Multi-Module Architecture", "Coroutines", "Retrofit", "Firebase", "Google Pay",
                "Accessibility Audit", "TalkBack",
            ),
        ),
        Project(
            name = "Kulturpunkte Hamburg",
            company = "apploft. GmbH",
            period = "11.2024 – 12.2025",
            description = "Hamburger Kulturpunkte-App mit Home-Screen-Widgets und Karte. " +
                    "Widget-Layouts, Map-Darstellung, Code Reviews und laufende UI-Anpassungen " +
                    "über mehrere Releases.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design", "Coroutines",
                "Google Maps", "Retrofit", "Firebase", "OneSignal",
                "Accessibility Audit",
            ),
        ),
        Project(
            name = "Lotto Niedersachsen",
            company = "apploft. GmbH",
            period = "06.2022 – 11.2025",
            description = "Lotto-App mit Bingo, Receipt-Scan und Kundenkarte. Accessibility-" +
                    "Optimierungen für Screen Reader, Compose-FlowRow-Migration, Manual-Entry-" +
                    "Widgets und CameraX-basierter Kundenkarten-Scan.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "MVVM", "Coroutines",
                "CameraX", "Retrofit", "Firebase",
                "Accessibility Audit",
                "TalkBack",
            ),
        ),
        Project(
            name = "Gerolsteiner TrinkCheck",
            company = "apploft. GmbH",
            period = "01.2025 – 12.2025",
            description = "Trink- und Gesundheits-App mit Health-Connect-Anbindung. " +
                    "Edge-to-Edge UI, Landscape-Layouts, Lottie-Animationen, Onboarding-WebView " +
                    "und Migration auf eine neue Consent-Library.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Coroutines",
                "Health Connect", "Retrofit", "Firebase", "Usercentrics",
                "Gigya",
                "Accessibility Audit",
            ),
        ),
        Project(
            name = "GHB Service App",
            company = "apploft. GmbH (intern)",
            period = "10.2024 – 11.2025",
            description = "Interne Personalmanagement-App für Urlaub und Abwesenheiten. " +
                    "Urlaubsübersicht mit Jahresfilter, Absences-API, Styleguide-Refresh und " +
                    "MVVM-Architektur-Cleanup.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design", "MVVM",
                "Clean Architecture", "Multi-Module Architecture", "Coroutines",
                "Retrofit", "Coil", "Firebase", "Matomo", "Auth0",
            ),
        ),
        Project(
            name = "HEM Service App",
            company = "apploft. GmbH",
            period = "07.2025 – 11.2025",
            description = "Tankstellen/Preisfinder. Alpha-/Beta-Build-Types eingerichtet, " +
                    "Release-Pipeline und Branch-Scoping in der CI angepasst.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design",
                "Clean Architecture", "Multi-Module Architecture",
                "Coroutines", "Retrofit", "Firebase", "Google Maps",
            ),
        ),
        Project(
            name = "SC Freiburg",
            company = "apploft. GmbH",
            period = "02.2025 – 11.2025",
            description = "Fan-App des SC Freiburg im Whitelabel-Framework (mehrere Clubs). " +
                    "Club-Konfiguration für Wettbewerbs-IDs, Podcast-Menü, Home-Team-Logik und " +
                    "Release-Pipeline.",
            tags = listOf(
                "Java", "View System (XML)", "Material Design",
                "Retrofit", "OkHttp", "Firebase", "Usercentrics",
            ),
        ),
        Project(
            name = "Dynamo Dresden",
            company = "apploft. GmbH",
            period = "11.2025",
            description = "Fan-App der SG Dynamo Dresden mit Spielplan, Live-Ticker und " +
                    "Merchandising. Beiträge an Match-Center und Wettbewerbs-Features.",
            tags = listOf(
                "Kotlin", "View System (XML)", "Material Design",
                "Retrofit", "Firebase",
            ),
        ),
        Project(
            name = "HiPP Produkt App",
            company = "apploft. GmbH",
            period = "11.2025",
            description = "Produktinformations-App von HiPP mit E-Commerce-Anbindung. " +
                    "Edge-to-Edge UI, Coupons und Wartungs-Releases.",
            tags = listOf(
                "Kotlin", "Java", "View System (XML)", "Material Design",
                "Retrofit", "Firebase",
            ),
        ),
        Project(
            name = "Norderney Concierge",
            company = "apploft. GmbH",
            period = "10.2025",
            description = "Reiseführer- und Concierge-App für Norderney mit News und Events. " +
                    "Newsletter-Tile und Accessibility-Verbesserungen.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "View System (XML)", "Material Design",
                "Clean Architecture", "Multi-Module Architecture", "Coroutines",
                "Firebase", "OneSignal",
                "Accessibility Audit", "TalkBack",
            ),
        ),
        Project(
            name = "DFL Schenken & Helfen",
            company = "apploft. GmbH",
            period = "10.2025",
            description = "Geschenklos-Plattform der Deutschen Fernsehlotterie mit Gutschein-" +
                    "Management und PDF-Download. Modularisierte Multi-Feature-Architektur.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design", "MVVM", "Coroutines",
                "Retrofit", "Coil", "Firebase",
            ),
        ),
        Project(
            name = "Hexal Pollenflug",
            company = "apploft. GmbH",
            period = "10.2025",
            description = "Pollenflug-Vorhersage mit Location-Services und Wetter-Integration. " +
                    "Maintenance-Release mit Crashfix und Layout-Korrekturen.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "View System (XML)",
                "Coroutines", "Retrofit", "Firebase",
            ),
        ),
        Project(
            name = "KIMMA Radio",
            company = "apploft. GmbH",
            period = "10.2025",
            description = "Radio-Streaming- und Discovery-App mit Playlist-Management und " +
                    "Download-Feature. Compose-basierte UI mit serialisierten Content-Modellen.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design", "MVVM",
                "Clean Architecture", "Multi-Module Architecture",
                "Retrofit", "Coil", "ExoPlayer", "Firebase",
            ),
        ),
        Project(
            name = "A-ROSA River Cruises",
            company = "apploft. GmbH",
            period = "02.2024 – 10.2025",
            description = "Kreuzfahrt-App mit QR-Scanner, Wetter-Tiles und MyCruise-Rechnungen. " +
                    "Bugfixes am QR-Flow, neue Tiles, Navigations-Fixes und App-Icon-Update.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design",
                "Coroutines", "CameraX", "Retrofit", "Firebase",
                "Accessibility Audit", "TalkBack",
            ),
        ),
        Project(
            name = "Health 720 FoodChecker",
            company = "apploft. GmbH",
            period = "10.2025",
            description = "Ernährungs- und Challenge-App mit Quiz, Level-Tracking und " +
                    "Achievements. Modularisierte Feature-Architektur und Firebase-Analytics.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design", "MVVM",
                "Coroutines", "Kotlin Flow", "Retrofit", "Firebase", "Auth0",
            ),
        ),
        Project(
            name = "Deutsche Fernsehlotterie",
            company = "apploft. GmbH",
            period = "09.2025",
            description = "Ticket-App der Deutschen Fernsehlotterie. Migration zu GitHub und " +
                    "Modernisierung des Tech-Stacks (Build-Pipelines, Library-Updates).",
            tags = listOf(
                "Kotlin", "View System (XML)", "Material Design",
                "Coroutines", "Retrofit", "OkHttp", "Firebase",
            ),
        ),
        Project(
            name = "HiPP Baby App",
            company = "apploft. GmbH",
            period = "09.2025",
            description = "Ratgeber-App für Eltern mit Offline-Content und Coupons. " +
                    "Java/Kotlin-Mix; Privacy-Policy-Update und klassische Android-Patterns.",
            tags = listOf(
                "Java", "Kotlin", "View System (XML)", "Material Design",
                "Coroutines", "Retrofit", "Firebase",
            ),
        ),
        Project(
            name = "HiPP Kinder App",
            company = "apploft. GmbH",
            period = "05.2025 – 07.2025",
            description = "Kinder-App im HiPP-Universum. Alpha-/Beta-Build-Type-Setup und " +
                    "Release-Pipeline-Branch-Scoping.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Material Design",
                "Firebase", "Gradle Kotlin DSL",
            ),
        ),
        Project(
            name = "C&A Online-Shop",
            company = "apploft. GmbH",
            period = "04.2024 – 10.2024",
            description = "Internationale Android-Shop-App. Greeting- und Link-Widgets, " +
                    "Theme-Refactorings und Feature-Flag-Setup im überwiegend Java-basierten " +
                    "Bestand.",
            tags = listOf(
                "Kotlin", "Java", "Jetpack Compose", "Material Design", "MVVM", "MVP",
                "Clean Architecture", "Retrofit", "OkHttp", "Firebase", "Adjust",
            ),
        ),
        Project(
            name = "aidFIVE",
            company = "apploft. GmbH",
            period = "12.2023 – 01.2024",
            description = "Lotterie App mit Spendenfunktion. Onboarding und Landing Screens. " +
                    "Mehrsprachiges Layout, WebP-Optimierung, gendergerechte Texte und " +
                    "Onboarding-Animationen.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Material Design",
                "Coroutines", "Kotlin Flow", "Retrofit", "Firebase",
                "Matomo", "Facebook SDK",
            ),
        ),
        Project(
            name = "Mercedes me Service App",
            company = "apploft. GmbH",
            period = "08.2022 – 12.2022",
            description = "Service-Booking-App von Mercedes mit Damage-Report-Flow. " +
                    "Portrait-Videowiedergabe, Dealership-Search-Navigation und Insurance-Partner-UI " +
                    "in MVI-Architektur.",
            tags = listOf(
                "Kotlin", "Java", "MVI", "Dagger", "Clean Architecture",
                "Multi-Module Architecture", "Coroutines", "RxJava",
                "Google Maps", "Firebase",
            ),
        ),
        Project(
            name = "apploft Android Libraries (intern)",
            company = "apploft. GmbH",
            period = "08.2025 – 11.2025",
            description = "Zentrale Bibliothekssammlung für apploft-Apps (Application, HTTP, " +
                    "Preferences, Onboarding, Push, Settings, Styleguide …). Beiträge an " +
                    "Onboarding-Landscape, Window-Insets und BOM-Dokumentation.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Material Design", "MVVM",
                "Multi-Module Architecture", "Coroutines", "Kotlin Flow",
                "Gradle Kotlin DSL", "Auth0",
            ),
        ),
        Project(
            name = "apploft CI/Build Actions (intern)",
            company = "apploft. GmbH",
            period = "07.2025 – 12.2025",
            description = "GitHub-Actions- und Shell-Scripts-Suite für Android-Build-Pipelines " +
                    "(APK/Bundle, Release, 1Password). Artifact-Naming, Branch-Scoping " +
                    "und Deliverables-Pfade.",
            tags = listOf(
                "GitHub Actions", "Gradle Kotlin DSL",
            ),
        ),
        Project(
            name = "apploft WebView Validator (intern)",
            company = "apploft. GmbH",
            period = "08.2025 – 11.2025",
            description = "Internes Tool zum Validieren von WebViews in Kundenapps. " +
                    "Initiale Implementierung mit Compose-UI und Kotlinx Serialization.",
            tags = listOf(
                "Kotlin", "Jetpack Compose", "Compose Navigation", "Material Design",
                "Gradle Kotlin DSL",
            ),
        ),
        Project(
            name = "apploft App-Template (intern)",
            company = "apploft. GmbH",
            period = "12.2023 – 09.2025",
            description = "Android-App-Template (MVVM/Clean Architecture). Migration der " +
                    "Dependency-Quellen von Bitbucket auf GitHub Packages und begleitende " +
                    "Dokumentation.",
            tags = listOf(
                "Kotlin", "MVVM", "Compose Navigation", "Gradle Kotlin DSL",
            ),
        ),
        Project(
            name = "Newstobegood",
            company = "nine41",
            period = "01.2023 – 11.2023",
            description = "Flutter-News-Reader mit Lesezeichen-System, Deep-Linking und Auth. " +
                    "Bookmark-Persistenz, Swipe-Löschen, Tutorial-Dialoge und Auth-Integration.",
            tags = listOf(
                "Flutter", "Dart", "Riverpod", "Firebase", "Crashlytics", "Auth0", "Adjust",
            ),
        ),
        Project(
            name = "Bijou Brigitte Online-Shop",
            company = "nine41",
            period = "01.2023 – 02.2024",
            description = "Flutter-E-Commerce-App mit WebView-Integration und In-App-Rating-" +
                    "Engine. Event-Management, Bewertungen für Cart/Purchase/Registration und " +
                    "Analytics.",
            tags = listOf(
                "Flutter", "Dart", "Riverpod", "Firebase", "Crashlytics",
            ),
        ),
        Project(
            name = "Rotary App",
            company = "Mediabeam / Rotary Verlag",
            period = "02.2023 – 04.2023",
            description = "Flutter-App für Rotary-Event-Management. Dependency-Updates auf " +
                    "Flutter 3.7, permissionsfreies PDF-Handling und Token-Erneuerung.",
            tags = listOf(
                "Flutter", "Dart",
            ),
        ),
        Project(
            name = "Call a Bike",
            company = "Deutsche Bahn Connect GmbH",
            period = "07.2020 – 05.2022",
            description = "Whitelabel-Bikesharing-App in Kotlin und Java nach Scrum. " +
                    "Feature-Planung, Refactoring auf MVVM und Umstellung von XML auf " +
                    "Jetpack Compose.",
            tags = listOf(
                "Kotlin", "Java", "Jetpack Compose", "MVVM", "JUnit", "Espresso", "MockK",
            ),
        ),
//        Project(
//            name = "Fachschaftsrat 4",
//            company = "HTW Berlin",
//            period = "10.2016 – 03.2019",
//            description = "Aktives Mitglied. Leitung der Sommerfest-Organisation 2018 " +
//                    "(~500 Gäste) und Koordination von Bildungs-Support-Angeboten.",
//            tags = listOf(
//                "Volunteering", "Event-Organisation",
//            ),
//        ),
//        Project(
//            name = "Fachschaft Religionswissenschaft",
//            company = "Universität Heidelberg",
//            period = "10.2008 – 03.2016",
//            description = "Aktives Mitglied. Organisation der Vortragsreihe „Frieden und " +
//                    "Gewalt im Namen der Götter\"; Mitwirkung an der Ausstellung " +
//                    "„Religion in (Ex)Position\"; Unterstützung verschiedener studentischer " +
//                    "Initiativen.",
//            tags = listOf(
//                "Volunteering",
//            ),
//        ),
    )
}
