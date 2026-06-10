package dev.leoruland.cv.ui.screens.skills

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dev.leoruland.cv.data.SkillGroup
import dev.leoruland.cv.data.repository.SkillsRepository

class SkillsViewModel(
    repository: SkillsRepository,
) {
    private val _skillGroups = mutableStateOf(repository.getSkillGroups())
    val skillGroups: State<List<SkillGroup>> = _skillGroups
}
