package dev.leoruland.cv.feature.projects.data

import dev.leoruland.cv.feature.projects.content.ProjectsContent
import dev.leoruland.cv.feature.projects.domain.model.Project

interface ProjectsDataSource {
    fun getProjects(): List<Project>
}

class DefaultProjectsDataSource : ProjectsDataSource {
    override fun getProjects(): List<Project> = ProjectsContent.projects
}
