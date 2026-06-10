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
    val cs = MaterialTheme.colorScheme
    Surface(color = cs.background, contentColor = cs.onBackground) {
        Column(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text("AppTheme palette", style = MaterialTheme.typography.titleSmall)
            Swatch("primary", cs.primary, cs.onPrimary)
            Swatch("primaryContainer", cs.primaryContainer, cs.onPrimaryContainer)
            Swatch("secondary", cs.secondary, cs.onSecondary)
            Swatch("secondaryContainer", cs.secondaryContainer, cs.onSecondaryContainer)
            Swatch("tertiary", cs.tertiary, cs.onTertiary)
            Swatch("tertiaryContainer", cs.tertiaryContainer, cs.onTertiaryContainer)
            Swatch("background", cs.background, cs.onBackground)
            Swatch("surface", cs.surface, cs.onSurface)
            Swatch("surfaceVariant", cs.surfaceVariant, cs.onSurfaceVariant)
        }
    }
}

@Composable
private fun Swatch(name: String, bg: Color, fg: Color) {
    Surface(color = bg, contentColor = fg, modifier = Modifier.fillMaxWidth()) {
        Text(
            text = name,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
        )
    }
}
