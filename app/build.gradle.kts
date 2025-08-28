plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
    alias(libs.plugins.android.hilt)
    kotlin("plugin.serialization") version "2.0.20"
}

android {
    namespace = "com.example.aminhafazenda"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.aminhafazenda"
        minSdk = 28
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
    kotlinOptions {
        jvmTarget = "11"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.8"
    }

    kapt {
        includeCompileClasspath = false
        correctErrorTypes = true
    }

    hilt {
        enableAggregatingTask = false
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.material)

    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    implementation(libs.material)
    implementation(libs.navigation.compose)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.navigation.hilt)
    implementation(libs.navigation.hilt.compose)

    implementation(libs.google.hilt)
    kapt(libs.google.hilt.compiler)

    implementation(libs.androidx.material3.window.size)
    implementation(libs.ber.tlv)
    implementation(libs.draw.receipt)

    implementation(libs.kotlinx.serialization.json)
    implementation(libs.converter.gson)
    implementation(libs.glide)

    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    kapt(libs.room.compiler)
}