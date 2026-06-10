package dev.leoruland.cv.feature.skills.domain

import dev.leoruland.cv.feature.skills.data.SkillsDataSource
import dev.leoruland.cv.feature.skills.domain.model.SkillGroup

interface SkillsRepository {
    fun getSkillGroups(): List<SkillGroup>
}

class DefaultSkillsRepository(
    private val source: SkillsDataSource,
) : SkillsRepository {
    override fun getSkillGroups(): List<SkillGroup> = source.getSkillGroups()
}
