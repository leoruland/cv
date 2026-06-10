package dev.leoruland.cv.data.repository

import dev.leoruland.cv.data.Personal
import dev.leoruland.cv.data.source.PersonalDataSource

interface PersonalRepository {
    fun getPersonal(): Personal
}

class DefaultPersonalRepository(
    private val source: PersonalDataSource,
) : PersonalRepository {
    override fun getPersonal(): Personal = source.getPersonal()
}
