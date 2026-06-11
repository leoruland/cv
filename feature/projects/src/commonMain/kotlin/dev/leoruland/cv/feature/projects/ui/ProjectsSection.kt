package dev.leoruland.cv.feature.projects.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cv_app.feature.projects.generated.resources.Res
import cv_app.feature.projects.generated.resources.projects_headline
import dev.leoruland.cv.core.components.SectionTitle
import dev.leoruland.cv.feature.projects.content.ProjectsContent
import dev.leoruland.cv.feature.projects.domain.model.Project
import dev.leoruland.cv.feature.projects.ui.components.ProjectCard
import dev.leoruland.cv.theming.AppTheme
import org.jetbrains.compose.resources.stringResource

@Composable
fun ProjectsSection(
    projects: List<Project>,
    activeSkillNames: Set<String>,
    modifier: Modifier = Modifier,
) {
    val visible = if (activeSkillNames.isEmpty()) {
        projects
    } else {
        projects.filter { project -> project.tags.containsAll(activeSkillNames) }
    }
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        SectionTitle(stringResource(Res.string.projects_headline))
        visible.forEach { project ->
            ProjectCard(project = project, activeSkillNames = activeSkillNames)
        }
    }
}

@Preview
@Composable
private fun ProjectsSectionAllVisiblePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            ProjectsSection(
                projects = ProjectsContent.projects,
                activeSkillNames = emptySet(),
            )
        }
    }
}

@Preview
@Composable
private fun ProjectsSectionFilteredPreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            ProjectsSection(
                projects = ProjectsContent.projects,
                activeSkillNames = setOf("CameraX"),
            )
        }
    }
}
