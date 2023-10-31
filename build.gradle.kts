plugins {
    kotlin("jvm") version "1.9.0"
    id("maven-publish")
}

group = "io.deffun"
version = "0.1"

repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/AlexVoin04/snatch-kt")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
