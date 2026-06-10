package dev.leoruland.cv.ui.screens.experience

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dev.leoruland.cv.data.ExperienceEntry
import dev.leoruland.cv.data.repository.ExperienceRepository

class ExperienceViewModel(
    repository: ExperienceRepository,
) {
    private val _experience = mutableStateOf(repository.getExperience())
    val experience: State<List<ExperienceEntry>> = _experience
}
