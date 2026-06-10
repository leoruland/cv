package dev.leoruland.cv.data.repository

import dev.leoruland.cv.data.ExperienceEntry
import dev.leoruland.cv.data.source.ExperienceDataSource

interface ExperienceRepository {
    fun getExperience(): List<ExperienceEntry>
}

class DefaultExperienceRepository(
    private val source: ExperienceDataSource,
) : ExperienceRepository {
    override fun getExperience(): List<ExperienceEntry> = source.getExperience()
}
