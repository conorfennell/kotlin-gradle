plugins {
    kotlin("jvm") apply true
    java
}

group = "com.idiomcentric"

repositories {
    mavenCentral()
}

dependencies {
    api(project(":example-project"))
    implementation(kotlin("stdlib"))
}

apply<com.idiomcentric.HelloWorldPlugin>()

interface GreetingPluginExtension {
    val message: Property<String>
    val greeter: Property<String>
}

class GreetingPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<GreetingPluginExtension>("greeting")

        project.task("hello") {
            doLast {
                println("${extension.message.get()} from ${extension.greeter.get()}")
            }
        }
    }
}

apply<GreetingPlugin>()

configure<GreetingPluginExtension> {
    message.set("Hi")
    greeter.set("Gradle")
}