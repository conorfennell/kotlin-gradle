rootProject.name = "kotlin-gradle"

include("example-project")

pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.jvm") version "1.5.30"
    }
}