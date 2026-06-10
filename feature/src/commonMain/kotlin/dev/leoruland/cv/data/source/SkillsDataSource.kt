package dev.leoruland.cv.data.source

import dev.leoruland.cv.data.CvData
import dev.leoruland.cv.data.SkillGroup

interface SkillsDataSource {
    fun getSkillGroups(): List<SkillGroup>
}

class DefaultSkillsDataSource : SkillsDataSource {
    override fun getSkillGroups(): List<SkillGroup> = CvData.skillGroups
}
