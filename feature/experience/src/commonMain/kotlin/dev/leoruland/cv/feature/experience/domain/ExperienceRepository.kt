package dev.leoruland.cv.feature.experience.domain

import dev.leoruland.cv.feature.experience.domain.model.ExperienceEntry
import dev.leoruland.cv.feature.experience.data.ExperienceDataSource

interface ExperienceRepository {
    fun getExperience(): List<ExperienceEntry>
}

class DefaultExperienceRepository(
    private val source: ExperienceDataSource,
) : ExperienceRepository {
    override fun getExperience(): List<ExperienceEntry> = source.getExperience()
}
