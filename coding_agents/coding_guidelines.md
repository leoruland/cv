# Coding Guidelines

Conventions enforced for all code in this Kotlin Multiplatform / Compose Multiplatform project.

## Module layout

```
:app                  Composition root — wires routes, hosts NavigationContainer
:core                 Shared low-level UI building blocks (e.g. SectionTitle)
:theming              AppTheme, color scheme, theme palette preview
:navigation           NavigationTarget interface, NavigationContainer (responsive shell)
:feature:personal     Personal data screen + route
:feature:skills       Skills screen + route
:feature:experience   Experience screen + route
```

Each feature module owns its `ui/`, `navigation/`, `domain/`, `data/` subpackages.

## Package naming

- Root package: `dev.leoruland.cv`
- Module package suffix matches module path: `dev.leoruland.cv.core`, `dev.leoruland.cv.feature.personal`, etc.
- Generated Compose Resources class: `cv_app.<module>.generated.resources.Res`

## Theme

- Wrap any UI composition in `AppTheme { … }` from `:theming`.
- Read colors from `MaterialTheme.colorScheme.*` — never reference hex values from UI code.
- The seed colors are defined in `theming/src/commonMain/kotlin/dev/leoruland/cv/theming/Color.kt`. To change the palette, edit there; the rest of the app picks it up automatically.
- Visual sanity check: `CvThemePreviewLight` / `CvThemePreviewDark` in `Theme.kt` render the full role palette.

## Navigation

- Every route is a `data object` that implements `NavigationTarget`:
  - `labelRes: StringResource` — translated label, **not** a raw `String`.
  - `icon: ImageVector` — from `androidx.compose.material.icons.outlined.*`.
- The active route's label resolves via `stringResource(target.labelRes)` inside composables.
- `NavigationContainer` (in `:navigation`) is the responsive shell:
  - Portrait (`maxWidth <= maxHeight`) → `NavigationBar` (bottom)
  - Landscape (`maxWidth > maxHeight`) → `NavigationRail` (side)

## Strings & i18n

- Per-module string resources live at `<module>/src/commonMain/composeResources/values/strings.xml`.
- Access from Kotlin: `stringResource(Res.string.<key>)` with imports from `cv_app.<module>.generated.resources.*`.
- To add a language (e.g. English): create `values-en/strings.xml` in the same module with the same keys. No code changes needed.
- Modules that use `Res.string.*` must declare `implementation(compose.components.resources)` directly in their `build.gradle.kts` — transitive availability is not enough to trigger accessor generation.

## Previews

- Every public composable gets an `@Preview` function in the same file.
- **Non-screen composables**: wrap as `@Preview` → `AppTheme { Box(modifier = Modifier.padding(4.dp)) { … } }`. The 4.dp box prevents shadows/borders from being clipped at the preview edge.
- **Screens** and screen-sized shells (`PersonalScreen`, `ExperienceScreen`, `SkillsScreen`, `NavigationContainerPreview*`): no Box wrapper — they fill the preview by design.
- **Theme/palette previews**: a special case; render the palette without the Box wrapper.
- Preview functions are `private`.

## Visibility & file structure

- Helper composables within a screen file are `private`.
- Preview functions are `private`.
- One screen per file; helpers live in the same file unless they are reused across files (then move to `:core/components`).
- Domain models live in `<module>/domain/model/`; data sources in `<module>/data/`. UI never references data sources directly — go through a repository.

## Verification

Before declaring a change complete, run `./gradlew compileDebugKotlinAndroid` and inspect at least one relevant `@Preview` in Android Studio if the UI changed. See [build_commands.md](./build_commands.md).
