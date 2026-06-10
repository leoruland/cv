package dev.leoruland.cv.feature.experience.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dev.leoruland.cv.feature.experience.domain.model.ExperienceEntry
import dev.leoruland.cv.feature.experience.domain.ExperienceRepository

class ExperienceViewModel(
    repository: ExperienceRepository,
) {
    private val _experience = mutableStateOf(repository.getExperience())
    val experience: State<List<ExperienceEntry>> = _experience
}
