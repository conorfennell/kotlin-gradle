plugins {
    kotlin("jvm") version "1.5.30"
}

repositories {
    jcenter()
    maven { url = uri("https://kotlin.bintray.com/ktor") }
}

group = "com.idiomcentric"

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation(gradleApi())
    implementation(localGroovy())
}
