plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.example.feature_finance"
    compileSdk = 33

    defaultConfig {
        minSdk = Dependencies.AppConfig.minSdk
        targetSdk = Dependencies.AppConfig.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
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
        jvmTarget = Dependencies.AppConfig.jvmTarget
    }
}

dependencies {

    kapt (Dependencies.Libraries.daggerkapt)
    implementation (Dependencies.Libraries.dagger)
    implementation (Dependencies.Libraries.daggercompiler)

    implementation (Dependencies.AndroidXLibraries.corektx)
    implementation (Dependencies.AndroidXLibraries.appcompat)
    implementation (Dependencies.AndroidXLibraries.material)
    implementation (Dependencies.AndroidXLibraries.constraintlayout)
    implementation(Dependencies.AndroidXLibraries.navigationfragment)
    implementation(Dependencies.AndroidXLibraries.navigationui)
    implementation(Dependencies.AndroidXLibraries.navigationdynamicfeaturemodule)

    testImplementation (Dependencies.TestLibraries.junit)
    androidTestImplementation (Dependencies.TestLibraries.espresso)

}