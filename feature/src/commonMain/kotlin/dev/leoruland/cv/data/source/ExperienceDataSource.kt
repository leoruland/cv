package dev.leoruland.cv.data.source

import dev.leoruland.cv.data.CvData
import dev.leoruland.cv.data.ExperienceEntry

interface ExperienceDataSource {
    fun getExperience(): List<ExperienceEntry>
}

class DefaultExperienceDataSource : ExperienceDataSource {
    override fun getExperience(): List<ExperienceEntry> = CvData.experience
}
