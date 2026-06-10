package dev.leoruland.cv.data.repository

import dev.leoruland.cv.data.SkillGroup
import dev.leoruland.cv.data.source.SkillsDataSource

interface SkillsRepository {
    fun getSkillGroups(): List<SkillGroup>
}

class DefaultSkillsRepository(
    private val source: SkillsDataSource,
) : SkillsRepository {
    override fun getSkillGroups(): List<SkillGroup> = source.getSkillGroups()
}
