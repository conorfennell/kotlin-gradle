package com.idiomcentric

import org.gradle.api.Plugin
import org.gradle.api.Project

open class HelloWorldPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project
            .tasks
            .create("hello-world", HelloWorldTask::class.java)
    }
}
