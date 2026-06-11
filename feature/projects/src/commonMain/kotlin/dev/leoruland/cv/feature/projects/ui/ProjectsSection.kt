package dev.leoruland.cv.feature.projects.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
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

fun LazyListScope.projectsSection(
    projects: List<Project>,
    activeSkillNames: Set<String>,
) {
    val visible = if (activeSkillNames.isEmpty()) {
        projects
    } else {
        projects.filter { project -> project.tags.containsAll(activeSkillNames) }
    }
    if (visible.isNotEmpty()) {
        item(key = "projects-headline") {
            SectionTitle(stringResource(Res.string.projects_headline))
        }
    }
    items(items = visible, key = { it.name }) { project ->
        ProjectCard(project = project, activeSkillNames = activeSkillNames)
    }
}

@Preview
@Composable
private fun ProjectsSectionAllVisiblePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                projectsSection(
                    projects = ProjectsContent.projects,
                    activeSkillNames = emptySet(),
                )
            }
        }
    }
}

@Preview
@Composable
private fun ProjectsSectionFilteredPreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                projectsSection(
                    projects = ProjectsContent.projects,
                    activeSkillNames = setOf("CameraX"),
                )
            }
        }
    }
}
