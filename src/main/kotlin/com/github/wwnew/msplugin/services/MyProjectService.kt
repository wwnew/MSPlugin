package com.github.wwnew.msplugin.services

import com.intellij.openapi.project.Project
import com.github.wwnew.msplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
