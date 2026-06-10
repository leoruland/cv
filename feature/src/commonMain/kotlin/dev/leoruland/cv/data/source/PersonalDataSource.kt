package dev.leoruland.cv.data.source

import dev.leoruland.cv.data.CvData
import dev.leoruland.cv.data.Personal

interface PersonalDataSource {
    fun getPersonal(): Personal
}

class DefaultPersonalDataSource : PersonalDataSource {
    override fun getPersonal(): Personal = CvData.personal
}
