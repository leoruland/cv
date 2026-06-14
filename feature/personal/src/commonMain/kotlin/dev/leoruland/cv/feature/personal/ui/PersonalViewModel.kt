package dev.leoruland.cv.feature.personal.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dev.leoruland.cv.feature.personal.domain.model.Personal
import dev.leoruland.cv.feature.personal.domain.PersonalRepository

class PersonalViewModel(
    repository: PersonalRepository,
) {
    private val _personal = mutableStateOf(repository.getPersonal())
    val personalData: State<Personal> = _personal
}
