package dev.leoruland.cv.feature.skills.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import dev.leoruland.cv.feature.projects.domain.ProjectsRepository
import dev.leoruland.cv.feature.projects.domain.model.Project
import dev.leoruland.cv.feature.skills.domain.SkillsRepository
import dev.leoruland.cv.feature.skills.domain.model.SkillGroup

class SkillsViewModel(
    skillsRepository: SkillsRepository,
    projectsRepository: ProjectsRepository,
) {
    private val _skillGroups = mutableStateOf(skillsRepository.getSkillGroups())
    val skillGroups: State<List<SkillGroup>> = _skillGroups

    val activeSkillNames: State<Set<String>> = derivedStateOf {
        _skillGroups.value
            .flatMap { group -> group.items }
            .filter { it.isActive }
            .map { it.name }
            .toSet()
    }

    val projects: State<List<Project>> = mutableStateOf(projectsRepository.getProjects())

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
