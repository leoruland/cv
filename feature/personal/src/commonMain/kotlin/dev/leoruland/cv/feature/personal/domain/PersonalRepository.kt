package dev.leoruland.cv.feature.personal.domain

import dev.leoruland.cv.feature.personal.domain.model.Personal
import dev.leoruland.cv.feature.personal.data.PersonalDataSource

interface PersonalRepository {
    fun getPersonal(): Personal
}

class DefaultPersonalRepository(
    private val source: PersonalDataSource,
) : PersonalRepository {
    override fun getPersonal(): Personal = source.getPersonal()
}
