package dev.leoruland.cv.feature.skills.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.leoruland.cv.feature.skills.domain.model.Skill
import dev.leoruland.cv.theming.AppTheme

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
                TagChip(skill = Skill(name = "Kotlin", isActive = true), onClick = {})
                TagChip(skill = Skill(name = "Coroutines", isActive = true), onClick = {})
                TagChip(skill = Skill(name = "Compose"), onClick = {})
                TagChip(skill = Skill(name = "Material 3"), onClick = {})
                TagChip(skill = Skill(name = "CameraX"), onClick = {})
            }
        }
    }
}
