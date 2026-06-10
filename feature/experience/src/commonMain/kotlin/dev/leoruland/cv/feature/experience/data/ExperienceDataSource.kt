package dev.leoruland.cv.feature.experience.data

import dev.leoruland.cv.feature.experience.domain.model.ExperienceEntry
import dev.leoruland.cv.feature.experience.content.ExperienceContent

interface ExperienceDataSource {
    fun getExperience(): List<ExperienceEntry>
}

class DefaultExperienceDataSource : ExperienceDataSource {
    override fun getExperience(): List<ExperienceEntry> = ExperienceContent.experience
}
