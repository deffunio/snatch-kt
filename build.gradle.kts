plugins {
    kotlin("jvm") version "1.9.0"
    id("maven-publish")
}

group = "io.deffun"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/AlexVoin04/snatch-kt")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
