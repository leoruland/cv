package dev.leoruland.cv.theming

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content,
    )
}

@Preview
@Composable
private fun AppThemePreviewLight() {
    AppTheme(darkTheme = false) { Palette() }
}

@Preview
@Composable
private fun AppThemePreviewDark() {
    AppTheme(darkTheme = true) { Palette() }
}

@Composable
private fun Palette() {
    val colorScheme = MaterialTheme.colorScheme
    Surface(color = colorScheme.background, contentColor = colorScheme.onBackground) {
        Column(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text("AppTheme palette", style = MaterialTheme.typography.titleSmall)
            Swatch("primary", colorScheme.primary, colorScheme.onPrimary)
            Swatch("primaryContainer", colorScheme.primaryContainer, colorScheme.onPrimaryContainer)
            Swatch("secondary", colorScheme.secondary, colorScheme.onSecondary)
            Swatch("secondaryContainer", colorScheme.secondaryContainer, colorScheme.onSecondaryContainer)
            Swatch("tertiary", colorScheme.tertiary, colorScheme.onTertiary)
            Swatch("tertiaryContainer", colorScheme.tertiaryContainer, colorScheme.onTertiaryContainer)
            Swatch("background", colorScheme.background, colorScheme.onBackground)
            Swatch("surface", colorScheme.surface, colorScheme.onSurface)
            Swatch("surfaceVariant", colorScheme.surfaceVariant, colorScheme.onSurfaceVariant)
        }
    }
}

@Composable
private fun Swatch(name: String, background: Color, foreground: Color) {
    Surface(color = background, contentColor = foreground, modifier = Modifier.fillMaxWidth()) {
        Text(
            text = name,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
        )
    }
}
