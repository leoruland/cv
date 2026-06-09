package dev.leoruland.cv

import androidx.compose.runtime.Composable
import dev.leoruland.cv.ui.screens.NavigationContainer
import dev.leoruland.cv.ui.theme.CvTheme

@Composable
fun App() {
    CvTheme {
        NavigationContainer()
    }
}
