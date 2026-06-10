package dev.leoruland.cv.data.source

import dev.leoruland.cv.data.SkillGroup
import dev.leoruland.cv.ui.screens.skills.content.SkillsContent

interface SkillsDataSource {
    fun getSkillGroups(): List<SkillGroup>
}

class DefaultSkillsDataSource : SkillsDataSource {
    override fun getSkillGroups(): List<SkillGroup> = SkillsContent.skillGroups
}
