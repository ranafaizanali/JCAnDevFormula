plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)

    // For Serialization
    kotlin("plugin.serialization") version "2.0.21"
}

android {
    namespace = "com.example.jcandevformula"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.jcandevformula"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
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
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)

    // For Constraint Layouts
    implementation("androidx.constraintlayout:constraintlayout-compose:1.1.2")

    // For Extra Icons
    implementation("androidx.compose.material:material-icons-extended")

    // For Navigation
    implementation("androidx.navigation:navigation-compose:2.10.2")

    // For Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")
}