# CV Leonardo Ruland — Kotlin Multiplatform PWA

Compose Multiplatform app shipping as an Android app, an iOS app, and an installable Progressive Web App. Single codebase under `dev.leoruland.cv.*`.

## Screens

- **Personalien** — contact, tagline, education
- **Kenntnisse** — architecture, frameworks, build/tracking
- **Erfahrung** — work history with bullet highlights

## Architecture

Multi-module Gradle build. Module dependencies point inward: feature modules consume `:core`, `:navigation`, `:theming`.

| Module | Responsibility |
|---|---|
| `:app` | Composition root. Wires routes, hosts `NavigationContainer`. |
| `:core` | Shared low-level UI building blocks (e.g. `SectionTitle`). |
| `:theming` | `AppTheme`, light/dark color schemes, palette preview. |
| `:navigation` | `NavigationTarget` interface, responsive `NavigationContainer`. |
| `:feature:personal` | Personal data screen + route. |
| `:feature:skills` | Skills screen + route. |
| `:feature:experience` | Experience screen + route. |

## Responsive navigation

`NavigationContainer` (in `:navigation`) wraps the active screen and chooses the chrome via `BoxWithConstraints`:

- `maxWidth <= maxHeight` (portrait) → `NavigationBar` at the bottom.
- `maxWidth > maxHeight` (landscape) → `NavigationRail` on the side.

Each route implements `NavigationTarget` with `labelRes: StringResource` + `icon: ImageVector`. Labels resolve via `stringResource(target.labelRes)`.

## Theme

`AppTheme` lives in `theming/src/commonMain/kotlin/dev/leoruland/cv/theming/Theme.kt`. Color seeds are defined in the same module's `Color.kt`:

- primary `#00A485` (teal-green)
- secondary `#53E3BF` (mint-teal)
- tertiary `#D61FDC` (magenta)
- error `#FF5449` (canonical M3 error T60)
- surface `#D3E0DC`
- surfaceVariant `#919E9A`

All UI reads colors via `MaterialTheme.colorScheme.*`. To check contrast in light and dark, open `CvThemePreviewLight` / `CvThemePreviewDark` in `Theme.kt` — they render every role pair (color + on-color) as full-width swatches.

## Strings & i18n

User-visible strings live in per-module `src/commonMain/composeResources/values/strings.xml`. Access from Compose:

```kotlin
import cv_app.feature.personal.generated.resources.Res
import cv_app.feature.personal.generated.resources.section_contact
import org.jetbrains.compose.resources.stringResource

SectionTitle(stringResource(Res.string.section_contact))
```

To add English (or any other language): drop a `values-en/strings.xml` into the same module with the same keys. No Kotlin changes needed.

Currently localized: `:feature:personal`, `:feature:skills`, `:feature:experience`, `:navigation` (preview-only tab labels).

## Setup

```bash
cd app
gradle wrapper --gradle-version 8.10.2
```

Tool versions (`gradle/libs.versions.toml`):
- Kotlin 2.1.0
- Compose Multiplatform 1.7.3
- AGP 8.7.3
- compileSdk 35, minSdk 24

## Build & run

See [`coding_agents/build_commands.md`](./coding_agents/build_commands.md) for the full command reference. Quick start:

```bash
# Validation
./gradlew compileDebugKotlinAndroid

# Android
./gradlew :app:assembleDebug
./gradlew :app:installDebug   # with a device/emulator connected

# Web (PWA)
./gradlew :app:wasmJsBrowserDevelopmentRun           # dev
./gradlew :app:wasmJsBrowserDistribution             # production bundle
# Output: app/build/dist/wasmJs/productionExecutable

# iOS
# Open iosApp/iosApp.xcodeproj in Xcode, build & run on simulator.
```

## App icon

Master file: `app/src/wasmJsMain/resources/icon.svg`. Sizes are rendered with `qlmanage` + `sips`:

- **PWA**: `icon-192.png`, `icon-512.png` in `wasmJsMain/resources/`
- **Android**: `mipmap-{mdpi,hdpi,xhdpi,xxhdpi,xxxhdpi}/ic_launcher{,_round}.png`, wired in `AndroidManifest.xml`
- **iOS**: `Assets.xcassets/AppIcon.appiconset/` with 20/29/40/60 pt (@2x, @3x) plus 1024 px marketing icon

Re-render after editing the SVG:

```bash
SVG=app/src/wasmJsMain/resources/icon.svg
TMP=$(mktemp -d)
qlmanage -t -s 1024 -o "$TMP" "$SVG"
sips -z 192 192 "$TMP/icon.svg.png" --out app/src/wasmJsMain/resources/icon-192.png
# … repeat for the other sizes
```

## Structure

```
app/
├── settings.gradle.kts
├── build.gradle.kts
├── gradle/libs.versions.toml
├── README.md
├── CLAUDE.md / AGENTS.md / GEMINI.md      # agent-doc routers → coding_agents/
├── coding_agents/                          # binding instructions for AI/coding agents
│   ├── agent_principles.md
│   ├── coding_guidelines.md
│   ├── coding_templates.md
│   ├── build_commands.md
│   └── security.md
├── app/                                    # :app — composition root
│   └── src/{commonMain,androidMain,iosMain,wasmJsMain}/…
├── core/                                   # :core — shared UI building blocks
│   └── src/commonMain/kotlin/dev/leoruland/cv/core/components/SectionTitle.kt
├── theming/                                # :theming — AppTheme + Color.kt
│   └── src/commonMain/kotlin/dev/leoruland/cv/theming/{Color,Theme}.kt
├── navigation/                             # :navigation — NavigationTarget + container
│   └── src/commonMain/
│       ├── kotlin/dev/leoruland/cv/navigation/{NavigationTarget,NavigationContainer}.kt
│       └── composeResources/values/strings.xml
├── feature/
│   ├── personal/                           # :feature:personal
│   │   └── src/commonMain/
│   │       ├── kotlin/dev/leoruland/cv/feature/personal/{ui,navigation,domain,data}/
│   │       └── composeResources/values/strings.xml
│   ├── skills/                             # :feature:skills (same layout)
│   └── experience/                         # :feature:experience (same layout)
└── iosApp/                                 # Xcode project shell
```

## Agent documentation

Any AI or human contributor making code changes must read [`coding_agents/`](./coding_agents/) first. The three router files at the repo root (`CLAUDE.md`, `AGENTS.md`, `GEMINI.md`) all point there.
