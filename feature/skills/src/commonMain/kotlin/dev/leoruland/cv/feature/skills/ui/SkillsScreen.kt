package dev.leoruland.cv.feature.skills.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cv_app.feature.skills.generated.resources.Res
import cv_app.feature.skills.generated.resources.skills_headline
import dev.leoruland.cv.core.components.ChipFlowRow
import dev.leoruland.cv.core.components.SectionTitle
import dev.leoruland.cv.feature.projects.data.DefaultProjectsDataSource
import dev.leoruland.cv.feature.projects.domain.DefaultProjectsRepository
import dev.leoruland.cv.feature.projects.ui.projectsSection
import dev.leoruland.cv.feature.skills.data.DefaultSkillsDataSource
import dev.leoruland.cv.feature.skills.domain.DefaultSkillsRepository
import dev.leoruland.cv.feature.skills.ui.components.TagChip
import dev.leoruland.cv.theming.AppTheme
import org.jetbrains.compose.resources.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SkillsScreen(
    modifier: Modifier = Modifier,
    viewModel: SkillsViewModel = remember {
        SkillsViewModel(
            skillsRepository = DefaultSkillsRepository(DefaultSkillsDataSource()),
            projectsRepository = DefaultProjectsRepository(DefaultProjectsDataSource()),
        )
    },
) {
    val groups by viewModel.skillGroups
    val activeSkillNames by viewModel.activeSkillNames
    val projects by viewModel.projects
    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        item(key = "skills-headline") {
            Text(
                stringResource(Res.string.skills_headline),
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.primary,
            )
        }
        item(key = "skills-headline-spacer") {
            Spacer(Modifier.height(4.dp))
        }
        itemsIndexed(items = groups, key = { _, group -> group.title }) { groupIndex, group ->
            SectionTitle(group.title)
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    contentColor = MaterialTheme.colorScheme.onSurface,
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
            ) {
                ChipFlowRow(modifier = Modifier.padding(all = 8.dp)) {
                    group.items.forEachIndexed { skillIndex, skill ->
                        TagChip(
                            skill = skill,
                            onClick = { viewModel.toggleSkill(groupIndex, skillIndex) },
                        )
                    }
                }
            }
        }
        item(key = "projects-spacer") {
            Spacer(Modifier.height(16.dp))
        }
        projectsSection(
            projects = projects,
            activeSkillNames = activeSkillNames,
        )
    }
}

@Preview
@Composable
private fun SkillsScreenPreview() {
    AppTheme {
        SkillsScreen()
    }
}
