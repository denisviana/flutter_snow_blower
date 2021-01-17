package com.github.denisviana.fluttersnowblower.services

import com.github.denisviana.fluttersnowblower.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
