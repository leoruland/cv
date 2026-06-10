package dev.leoruland.cv.feature.skills.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.leoruland.cv.feature.skills.domain.model.Skill
import dev.leoruland.cv.theming.AppTheme
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TagChip(
    modifier: Modifier = Modifier,
    skill: Skill,
    onClick: () -> Unit,
) {
    val containerColor = if (skill.isActive) {
        MaterialTheme.colorScheme.tertiaryContainer
    } else {
        MaterialTheme.colorScheme.surfaceVariant
    }
    val contentColor = if (skill.isActive) {
        MaterialTheme.colorScheme.onTertiaryContainer
    } else {
        MaterialTheme.colorScheme.onSurfaceVariant
    }
    CompositionLocalProvider(LocalMinimumInteractiveComponentSize provides Dp.Unspecified) {
        Surface(
            modifier = modifier,
            onClick = onClick,
            shape = MaterialTheme.shapes.extraLarge,
            color = containerColor,
            contentColor = contentColor,
        ) {
            Text(
                text = skill.name,
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
            )
        }
    }
}

@Preview
@Composable
private fun TagChipActivePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            TagChip(skill = Skill(name = "Kotlin", isActive = true), onClick = {})
        }
    }
}

@Preview
@Composable
private fun TagChipInactivePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            TagChip(skill = Skill(name = "Kotlin", isActive = false), onClick = {})
        }
    }
}

@Preview
@Composable
private fun TagChipInteractivePreview() {
    AppTheme {
        var skill by remember { mutableStateOf(Skill("Tap me", isActive = false)) }
        Row(
            modifier = Modifier.padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            TagChip(skill = skill, onClick = { skill = skill.copy(isActive = !skill.isActive) })
        }
    }
}
