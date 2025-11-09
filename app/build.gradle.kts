plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

apply(plugin = "androidx.navigation.safeargs.kotlin")
apply(plugin = "org.jetbrains.kotlin.kapt")

android {
    namespace = "br.com.helpcsistemas.app"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "br.com.helpcsistemas.app"
        minSdk = 27
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":core"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)

    implementation(libs.androidx.recyclerview.v140)
    implementation(libs.androidx.navigation.fragment.ktx.v296)
    implementation(libs.androidx.navigation.ui.ktx.v296)
    implementation(libs.lifeCicleExtensions)
    implementation(libs.kotlinx.coroutines.core.v1102)
    implementation(libs.kotlinx.coroutines.android.v1102)
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    add("kapt", "androidx.room:room-compiler:2.6.1")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    implementation("com.google.dagger:dagger:2.46.1")
    implementation("com.google.dagger:dagger-android-support:2.46.1")
    add("kapt", "com.google.dagger:dagger-compiler:2.46.1")
    add("kapt", "com.google.dagger:dagger-android-processor:2.46.1")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}