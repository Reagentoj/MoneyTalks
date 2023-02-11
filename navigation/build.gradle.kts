plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.navigation"
    compileSdk = 33

    defaultConfig {
        minSdk = 26
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(Dependencies.Modules.app))

    implementation(Dependencies.AndroidXLibraries.navigationfragment)
    implementation(Dependencies.AndroidXLibraries.navigationui)
    implementation(Dependencies.AndroidXLibraries.navigationfeaturemodule)
    implementation(Dependencies.AndroidXLibraries.corektx)
    implementation(Dependencies.AndroidXLibraries.appcompat)
    implementation(Dependencies.AndroidXLibraries.material)
    testImplementation(Dependencies.TestLibraries.junit)
    androidTestImplementation(Dependencies.TestLibraries.espresso)
}