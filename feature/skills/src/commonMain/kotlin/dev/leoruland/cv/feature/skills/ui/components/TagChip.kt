package dev.leoruland.cv.feature.skills.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.leoruland.cv.feature.skills.domain.model.Skill
import dev.leoruland.cv.theming.AppTheme

@Composable
fun TagChip(
    modifier: Modifier = Modifier,
    skill: Skill,
    onClick: () -> Unit,
) {
    val containerColor = if (skill.isActive) {
        MaterialTheme.colorScheme.tertiary
    } else {
        MaterialTheme.colorScheme.surfaceVariant
    }
    val contentColor = if (skill.isActive) {
        MaterialTheme.colorScheme.onTertiary
    } else {
        MaterialTheme.colorScheme.onSurfaceVariant
    }
    CompositionLocalProvider(LocalMinimumInteractiveComponentSize provides Dp.Unspecified) {
        Surface(
            modifier = modifier then Modifier.heightIn(min = 48.dp),
            onClick = onClick,
            shape = MaterialTheme.shapes.extraLarge,
            color = containerColor,
            contentColor = contentColor,
        ) {
            Box {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp).align(Alignment.Center),
                    text = skill.name,
                    style = MaterialTheme.typography.labelLarge,
                )
            }
        }
    }
}

@Preview
@Composable
private fun TagChipActivePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(0.dp)) {
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
