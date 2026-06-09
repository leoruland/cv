package com.leoruland.cv.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val CvLightColors = lightColorScheme(
    primary = M3Primary,
    onPrimary = M3OnPrimary,
    primaryContainer = M3PrimaryContainer,
    onPrimaryContainer = M3OnPrimaryContainer,
    secondary = M3Secondary,
    secondaryContainer = M3SecondaryContainer,
    onSecondaryContainer = M3OnSecondaryContainer,
    tertiary = M3Tertiary,
    background = M3Background,
    onBackground = M3OnSurface,
    surface = M3Surface,
    onSurface = M3OnSurface,
    surfaceVariant = M3SurfaceVariant,
    onSurfaceVariant = M3OnSurfaceVariant,
    outline = M3Outline,
    outlineVariant = M3OutlineVariant,
    surfaceTint = M3SurfaceTint,
)

@Composable
fun CvTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = CvLightColors,
        content = content,
    )
}
