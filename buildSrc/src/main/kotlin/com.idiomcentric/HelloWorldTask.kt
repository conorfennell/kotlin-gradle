package com.idiomcentric

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

// https://medium.com/@lovikasaxena/create-gradle-plugins-with-task-in-kotlin-c3d9510a000
open class HelloWorldTask(): DefaultTask() {
    @TaskAction
    fun helloWorld() {
        println("Hello World!")
    }
}
