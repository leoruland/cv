package dev.leoruland.cv.feature.skills.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dev.leoruland.cv.feature.skills.domain.SkillsRepository
import dev.leoruland.cv.feature.skills.domain.model.SkillGroup

class SkillsViewModel(
    repository: SkillsRepository,
) {
    private val _skillGroups = mutableStateOf(repository.getSkillGroups())
    val skillGroups: State<List<SkillGroup>> = _skillGroups
}
