package dev.leoruland.cv.feature.projects.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.leoruland.cv.core.components.ChipFlowRow
import dev.leoruland.cv.feature.projects.domain.model.Project
import dev.leoruland.cv.theming.AppTheme

@Composable
fun ProjectCard(
    project: Project,
    activeSkillNames: Set<String>,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outlineVariant,
                shape = RoundedCornerShape(16.dp),
            ),
    ) {
        Column(Modifier.padding(14.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = project.name,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.weight(1f),
                )
                DateChip(project.period)
            }
            Text(
                text = project.company,
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(top = 2.dp),
            )
            Text(
                text = project.description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(top = 6.dp),
            )
            if (project.tags.isNotEmpty()) {
                Spacer(Modifier.height(10.dp))
                ChipFlowRow {
                    project.tags.forEach { tag ->
                        ReadOnlyTagChip(label = tag, isActive = tag in activeSkillNames)
                    }
                }
            }
        }
    }
}

@Composable
private fun DateChip(text: String) {
    Surface(
        shape = RoundedCornerShape(999.dp),
        color = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 2.dp),
        )
    }
}

private val previewProject = Project(
    name = "Pixolo Passport App",
    company = "apploft. GmbH",
    period = "06.2025 – heute",
    description = "Android-Neuentwicklung mit CameraX/ML Kit-Pipeline und Compose-UI.",
    tags = listOf("Kotlin", "Jetpack Compose", "CameraX", "ML Kit"),
)

@Preview
@Composable
private fun ProjectCardPreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            ProjectCard(project = previewProject, activeSkillNames = setOf("Kotlin", "CameraX"))
        }
    }
}
