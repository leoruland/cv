package dev.leoruland.cv.theming

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CvTheme(
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
private fun CvThemePreviewLight() {
    CvTheme(darkTheme = false) { Palette() }
}

@Preview
@Composable
private fun CvThemePreviewDark() {
    CvTheme(darkTheme = true) { Palette() }
}

@Composable
private fun Palette() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text("CvTheme palette", style = MaterialTheme.typography.titleSmall)
            Swatch("primary", MaterialTheme.colorScheme.primary)
            Swatch("primaryContainer", MaterialTheme.colorScheme.primaryContainer)
            Swatch("secondary", MaterialTheme.colorScheme.secondary)
            Swatch("tertiary", MaterialTheme.colorScheme.tertiary)
            Swatch("surfaceVariant", MaterialTheme.colorScheme.surfaceVariant)
        }
    }
}

@Composable
private fun Swatch(name: String, color: Color) {
    Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
        Surface(color = color, modifier = Modifier.size(24.dp)) {}
        Text(
            text = "  $name",
            style = MaterialTheme.typography.labelMedium,
        )
    }
}
