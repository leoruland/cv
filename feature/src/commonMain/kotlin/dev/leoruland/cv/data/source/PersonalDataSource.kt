package dev.leoruland.cv.data.source

import dev.leoruland.cv.data.Personal
import dev.leoruland.cv.ui.screens.personal.content.PersonalContent

interface PersonalDataSource {
    fun getPersonal(): Personal
}

class DefaultPersonalDataSource : PersonalDataSource {
    override fun getPersonal(): Personal = PersonalContent.personal
}
