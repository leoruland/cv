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

    fun toggleSkill(groupIndex: Int, skillIndex: Int) {
        _skillGroups.value = _skillGroups.value.mapIndexed { gi, group ->
            if (gi != groupIndex) return@mapIndexed group
            group.copy(
                items = group.items.mapIndexed { si, skill ->
                    if (si == skillIndex) skill.copy(isActive = !skill.isActive) else skill
                },
            )
        }
    }
}
