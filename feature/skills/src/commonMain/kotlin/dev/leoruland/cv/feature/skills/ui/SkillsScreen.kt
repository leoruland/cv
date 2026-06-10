package dev.leoruland.cv.feature.skills.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import dev.leoruland.cv.feature.skills.data.DefaultSkillsDataSource
import dev.leoruland.cv.feature.skills.domain.DefaultSkillsRepository
import dev.leoruland.cv.feature.skills.ui.components.ChipFlowRow
import dev.leoruland.cv.core.components.SectionTitle
import dev.leoruland.cv.feature.skills.ui.components.TagChip
import dev.leoruland.cv.theming.AppTheme
import org.jetbrains.compose.resources.stringResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SkillsScreen(
    modifier: Modifier = Modifier,
    viewModel: SkillsViewModel = remember {
        SkillsViewModel(DefaultSkillsRepository(DefaultSkillsDataSource()))
    },
) {
    val groups by viewModel.skillGroups
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            stringResource(Res.string.skills_headline),
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.primary,
        )
        Spacer(Modifier.height(4.dp))
        groups.forEach { group ->
            SectionTitle(group.title)
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    contentColor = MaterialTheme.colorScheme.onSurface,
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
                modifier = Modifier.fillMaxWidth(),
            ) {
                ChipFlowRow(modifier = Modifier.padding(14.dp)) {
                    group.items.forEach { TagChip(it) }
                }
            }
        }
    }
}

@Preview
@Composable
private fun SkillsScreenPreview() {
    AppTheme {
        SkillsScreen()
    }
}
