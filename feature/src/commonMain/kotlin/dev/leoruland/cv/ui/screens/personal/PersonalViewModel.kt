package dev.leoruland.cv.ui.screens.personal

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import dev.leoruland.cv.data.Personal
import dev.leoruland.cv.data.repository.PersonalRepository

class PersonalViewModel(
    repository: PersonalRepository,
) {
    private val _personal = mutableStateOf(repository.getPersonal())
    val personal: State<Personal> = _personal
}
