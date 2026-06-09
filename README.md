# CV Leonardo Ruland – Kotlin Multiplatform PWA

Compose-Multiplatform-App, die als Android-App, iOS-App und Progressive Web App
läuft. UI orientiert sich am Material-3-Layout aus `cv-b2-content.html`.

## Drei Screens

- **Personalien** – Kontaktdaten, Tagline, Ausbildung
- **Kenntnisse** – Architektur, Frameworks, Build/Tracking
- **Erfahrung** – Berufsstationen mit Bullets

## Responsive Navigation

`App.kt` wertet `BoxWithConstraints` aus:

- `maxWidth <= maxHeight` (Portrait) → `NavigationBar` (Bottom)
- `maxWidth > maxHeight`  (Landscape) → `NavigationRail` (Seitenleiste)

## Setup

Im Verzeichnis `app/` einmalig den Gradle-Wrapper anlegen:

```bash
cd app
gradle wrapper --gradle-version 8.10.2
```

Versionen (`gradle/libs.versions.toml`):
- Kotlin 2.1.0
- Compose Multiplatform 1.7.3
- AGP 8.7.3
- compileSdk 35, minSdk 24

## Bauen & Ausführen

**Android Debug-APK:**
```bash
./gradlew :app:assembleDebug
./gradlew :app:installDebug   # bei verbundenem Gerät
```

**Web (PWA) lokal starten:**
```bash
./gradlew :app:wasmJsBrowserDevelopmentRun
```
Produktions-Build:
```bash
./gradlew :app:wasmJsBrowserDistribution
# Output: app/build/dist/wasmJs/productionExecutable
```
Den Inhalt dieses Ordners über HTTPS deployen, dann installiert der Browser
die App als PWA (Service Worker + Manifest sind unter `resources/`).

**iOS:** Xcode-Projekt unter `iosApp/` öffnen und das KMP-Framework
`ComposeApp` als Build-Dependency einbinden. Alternativ über das KMP-Plugin
in Android Studio / Fleet das Modul `app` für `iosSimulatorArm64`
bauen und den Simulator starten.

## App-Icon

Master-Datei: `app/src/wasmJsMain/resources/icon.svg` (Primary-Hintergrund
`#6750A4`, Schrift `#EADDFF`, zwei Zeilen „leo" / „dev").

Aus dem SVG wurden via `qlmanage` + `sips` alle nötigen Größen gerendert:
- **PWA:** `icon-192.png`, `icon-512.png` (in `wasmJsMain/resources/`)
- **Android:** `mipmap-{mdpi,hdpi,xhdpi,xxhdpi,xxxhdpi}/ic_launcher.png` und
  `ic_launcher_round.png`, eingebunden in `AndroidManifest.xml`
- **iOS:** `Assets.xcassets/AppIcon.appiconset/` mit 20/29/40/60-pt (@2x, @3x)
  und 1024 px Marketing-Icon plus `Contents.json`

Neu generieren nach Änderung am SVG:
```bash
SVG=app/app/src/wasmJsMain/resources/icon.svg
TMP=$(mktemp -d)
qlmanage -t -s 1024 -o "$TMP" "$SVG"
sips -z 192 192 "$TMP/icon.svg.png" --out app/app/src/wasmJsMain/resources/icon-192.png
# ... usw. für weitere Größen
```

## Theme

`ui/theme/Color.kt` greift Hex-Werte aus dem HTML-CV auf:
- Primary `#6750A4`, PrimaryContainer `#EADDFF`, OnPrimaryContainer `#21005D`
- SecondaryContainer `#E8DEF8`, Outline `#CAC4D0`
- Background/Surface `#FEF7FF`, SurfaceVariant `#F3EDF7`

## Struktur

```
app/
├── settings.gradle.kts
├── build.gradle.kts
├── gradle.properties
├── gradle/libs.versions.toml
├── app/
│   ├── build.gradle.kts
│   └── src/
│       ├── commonMain/kotlin/com/leoruland/cv/
│       │   ├── App.kt
│       │   ├── data/CvData.kt
│       │   ├── ui/Navigation.kt
│       │   ├── ui/theme/{Theme,Color}.kt
│       │   ├── ui/components/{SectionTitle,TagChip,FlowRow}.kt
│       │   └── ui/screens/{Personal,Skills,Experience}Screen.kt
│       ├── androidMain/{kotlin,res,AndroidManifest.xml}
│       ├── iosMain/kotlin/com/leoruland/cv/MainViewController.kt
│       └── wasmJsMain/
│           ├── kotlin/com/leoruland/cv/main.kt
│           └── resources/{index.html, manifest.json, sw.js}
└── iosApp/iosApp/{iOSApp.swift, Info.plist}
```
