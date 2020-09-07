package com.github.jingtaozf.literateidea.services

import com.intellij.openapi.project.Project
import com.github.jingtaozf.literateidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
