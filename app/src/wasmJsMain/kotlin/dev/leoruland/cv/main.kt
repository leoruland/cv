package dev.leoruland.cv

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    document.title = "Leonardo Ruland"
    ComposeViewport(viewportContainerId = "ComposeTarget") { App() }
}
