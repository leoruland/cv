package dev.leoruland.cv.feature.personal.data

import dev.leoruland.cv.feature.personal.domain.model.Personal
import dev.leoruland.cv.feature.personal.content.PersonalContent

interface PersonalDataSource {
    fun getPersonal(): Personal
}

class DefaultPersonalDataSource : PersonalDataSource {
    override fun getPersonal(): Personal = PersonalContent.personal
}
