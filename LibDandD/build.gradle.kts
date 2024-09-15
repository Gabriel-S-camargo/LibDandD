// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

    kotlin("jvm") version "1.8" // Plugin Kotlin para projetos JVM
    id("maven-publish") // Plugin para publicação da biblioteca
}

group = "com.github.Gabriel-S-camargo"  // Seu usuário do GitHub
version = "1.0.0"  // Defina a versão da sua biblioteca

publishing {
    publications {
        create<MavenPublication>("release") {
            from(components["kotlin"]) //
            groupId = "com.github.Gabriel-S-camargo"
            artifactId = "LibDandD"
            version = "1.0.0"
        }
    }
}