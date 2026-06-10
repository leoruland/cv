# Build Commands

All commands assume the working directory is `app/`.

## Validation (run after every change)

```bash
./gradlew compileDebugKotlinAndroid
```

Compiles every module's Android variant. Cheapest end-to-end check. Must end in `BUILD SUCCESSFUL`.

## Android

```bash
./gradlew :app:assembleDebug                  # build debug APK
./gradlew :app:installDebug                   # install to connected device/emulator
```

## Web (PWA)

```bash
./gradlew :app:wasmJsBrowserDevelopmentRun    # dev server, hot-reload
./gradlew :app:wasmJsBrowserDistribution      # production bundle
# Output: app/build/dist/wasmJs/productionExecutable
```

Serve the production bundle over HTTPS for PWA install (service worker + manifest are in `app/src/wasmJsMain/resources/`).

## iOS

Open `iosApp/iosApp.xcodeproj` in Xcode and build. Alternatively, use Android Studio / Fleet's KMP plugin to build the `:app` module for `iosSimulatorArm64` and launch the simulator.

## Compose Resources

After editing any `composeResources/values/strings.xml`, the next compile regenerates the `Res` accessors automatically. To regenerate explicitly (useful when chasing a missing import):

```bash
./gradlew :<module>:generateResourceAccessorsForCommonMain
# examples:
./gradlew :feature:personal:generateResourceAccessorsForCommonMain
./gradlew :navigation:generateResourceAccessorsForCommonMain
```

Generated files land under `<module>/build/generated/compose/resourceGenerator/kotlin/…`. Do not edit by hand.

## Per-module compile

```bash
./gradlew :feature:personal:compileDebugKotlinAndroid
./gradlew :feature:skills:compileDebugKotlinAndroid
./gradlew :feature:experience:compileDebugKotlinAndroid
./gradlew :navigation:compileDebugKotlinAndroid
./gradlew :core:compileDebugKotlinAndroid
./gradlew :theming:compileDebugKotlinAndroid
```

Faster than the full graph when iterating in a single module.

## Initial setup (one-time)

```bash
gradle wrapper --gradle-version 8.10.2
```

Versions are centralized in `gradle/libs.versions.toml`.
