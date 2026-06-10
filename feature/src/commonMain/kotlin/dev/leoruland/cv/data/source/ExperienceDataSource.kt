package dev.leoruland.cv.data.source

import dev.leoruland.cv.data.ExperienceEntry
import dev.leoruland.cv.ui.screens.experience.content.ExperienceContent

interface ExperienceDataSource {
    fun getExperience(): List<ExperienceEntry>
}

class DefaultExperienceDataSource : ExperienceDataSource {
    override fun getExperience(): List<ExperienceEntry> = ExperienceContent.experience
}
