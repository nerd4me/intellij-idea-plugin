package com.github.nerd4me.intellijideaplugin.services

import com.intellij.openapi.project.Project
import com.github.nerd4me.intellijideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
