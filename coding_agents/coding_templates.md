# Coding Templates

Copy-paste-ready snippets for the most common tasks. Replace `<…>` placeholders.

## 1. New route (NavigationTarget)

File: `feature/<feature>/src/commonMain/kotlin/dev/leoruland/cv/feature/<feature>/navigation/<Feature>Route.kt`

```kotlin
package dev.leoruland.cv.feature.<feature>.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.<Icon>
import androidx.compose.ui.graphics.vector.ImageVector
import cv_app.feature.<feature>.generated.resources.Res
import cv_app.feature.<feature>.generated.resources.nav_<feature>
import dev.leoruland.cv.navigation.NavigationTarget
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.StringResource

@Serializable
data object <Feature>Route : NavigationTarget {
    override val labelRes: StringResource get() = Res.string.nav_<feature>
    override val icon: ImageVector get() = Icons.Outlined.<Icon>
}
```

## 2. New UI string

Add to `<module>/src/commonMain/composeResources/values/strings.xml`:

```xml
<string name="<key>"><Translated text></string>
```

Access from Kotlin (inside a `@Composable`):

```kotlin
import cv_app.<module>.generated.resources.Res
import cv_app.<module>.generated.resources.<key>
import org.jetbrains.compose.resources.stringResource

Text(stringResource(Res.string.<key>))
```

If `Res` is not yet generated for the module, run:

```bash
./gradlew :<module>:generateResourceAccessorsForCommonMain
```

## 3. Non-screen composable with preview

```kotlin
@Composable
fun <Foo>(modifier: Modifier = Modifier) {
    // …
}

@Preview
@Composable
private fun <Foo>Preview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            <Foo>()
        }
    }
}
```

Required imports for the Box wrapper:

```kotlin
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
```

## 4. Screen composable with preview

```kotlin
@Composable
fun <Foo>Screen(
    modifier: Modifier = Modifier,
    viewModel: <Foo>ViewModel = remember {
        <Foo>ViewModel(Default<Foo>Repository(Default<Foo>DataSource()))
    },
) {
    // …
}

@Preview
@Composable
private fun <Foo>ScreenPreview() {
    AppTheme { <Foo>Screen() }
}
```

No `Box` wrapper — screens fill the preview by design.

## 5. New UI module's `build.gradle.kts`

```kotlin
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinSerialization)
}

kotlin {
    androidTarget { /* … standard JvmTarget.JVM_17 block … */ }
    iosX64(); iosArm64(); iosSimulatorArm64()
    wasmJs { browser() }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":core"))
            implementation(project(":navigation"))
            implementation(project(":theming"))
            implementation(compose.components.resources) // mandatory if Res.string.* is used
        }
    }
}

android {
    namespace = "dev.leoruland.cv.feature.<feature>"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig { minSdk = libs.versions.android.minSdk.get().toInt() }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    debugImplementation(libs.compose.ui.tooling)
}
```

## 6. New module in `settings.gradle.kts`

```kotlin
include(":feature:<feature>")
```

Also register the route in `app/src/commonMain/kotlin/dev/leoruland/cv/App.kt` (destination list, serializer subclass, entry provider).
