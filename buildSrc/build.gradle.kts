plugins {
    kotlin("jvm") version "1.5.20"
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
