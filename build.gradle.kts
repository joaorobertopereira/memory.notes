// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    // define propriedades como extras no Kotlin DSL
    extra["coroutines_version"] = "1.3.0"
    extra["room_version"] = "2.2.2"
    extra["glide_version"] = "4.8.0"
    extra["nav_version"] = "2.5.3"
    extra["daggerVersion"] = "2.14.1"

    repositories {
        google()
        mavenCentral()
    }

    val navVersion: String = project.findProperty("nav_version")?.toString()
        ?: (extra["nav_version"]?.toString() ?: "2.5.3")

    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.jetbrains.kotlin.jvm) apply false
}