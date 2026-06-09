package dev.leoruland.cv

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val rootId = "ComposeTarget"
    document.title = "Leonardo Ruland – CV"
    CanvasBasedWindow(canvasElementId = rootId) { App() }
}
