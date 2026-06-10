package dev.leoruland.cv.feature.projects.domain

import dev.leoruland.cv.feature.projects.data.ProjectsDataSource
import dev.leoruland.cv.feature.projects.domain.model.Project

interface ProjectsRepository {
    fun getProjects(): List<Project>
}

class DefaultProjectsRepository(
    private val source: ProjectsDataSource,
) : ProjectsRepository {
    override fun getProjects(): List<Project> = source.getProjects()
}
