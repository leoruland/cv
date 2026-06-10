package dev.leoruland.cv.feature.skills.data

import dev.leoruland.cv.feature.skills.content.SkillsContent
import dev.leoruland.cv.feature.skills.domain.model.SkillGroup

interface SkillsDataSource {
    fun getSkillGroups(): List<SkillGroup>
}

class DefaultSkillsDataSource : SkillsDataSource {
    override fun getSkillGroups(): List<SkillGroup> = SkillsContent.skillGroups
}
