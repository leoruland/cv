package dev.leoruland.cv.feature.skills.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.leoruland.cv.theming.AppTheme
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ChipFlowRow(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    FlowRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp),
    ) { content() }
}

@Preview
@Composable
private fun ChipFlowRowPreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            ChipFlowRow {
                TagChip("Kotlin")
                TagChip("Coroutines")
                TagChip("Compose")
                TagChip("Material 3")
                TagChip("CameraX")
            }
        }
    }
}
