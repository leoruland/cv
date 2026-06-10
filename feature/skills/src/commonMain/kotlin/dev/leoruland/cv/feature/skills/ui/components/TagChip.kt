package dev.leoruland.cv.feature.skills.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.leoruland.cv.feature.skills.domain.model.Skill
import dev.leoruland.cv.theming.AppTheme
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TagChip(skill: Skill, modifier: Modifier = Modifier) {
    val containerColor = if (skill.isActive) {
        MaterialTheme.colorScheme.tertiaryContainer
    } else {
        MaterialTheme.colorScheme.secondaryContainer
    }
    val contentColor = if (skill.isActive) {
        MaterialTheme.colorScheme.onTertiaryContainer
    } else {
        MaterialTheme.colorScheme.onSecondaryContainer
    }
    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.extraLarge,
        color = containerColor,
        contentColor = contentColor,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
    ) {
        Text(
            text = skill.name,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
        )
    }
}

@Preview
@Composable
private fun TagChipActivePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            TagChip(Skill("Kotlin", isActive = true))
        }
    }
}

@Preview
@Composable
private fun TagChipInactivePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            TagChip(Skill("Kotlin", isActive = false))
        }
    }
}

@Preview
@Composable
private fun TagChipBothStatesPreview() {
    AppTheme {
        Row(
            modifier = Modifier.padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            TagChip(Skill("Active", isActive = true))
            TagChip(Skill("Inactive", isActive = false))
        }
    }
}
