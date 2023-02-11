plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.example.navigation"
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

    implementation(project(Dependencies.Modules.cryptocurrencies))
    implementation(project(Dependencies.Modules.login))
    implementation(project(Dependencies.Modules.profile))
    implementation(project(Dependencies.Modules.splashscreen))
    implementation(project(Dependencies.Modules.stocks))
    implementation(project(Dependencies.Modules.finance))

    implementation(Dependencies.AndroidXLibraries.navigationfragment)
    implementation(Dependencies.AndroidXLibraries.navigationui)
    implementation(Dependencies.AndroidXLibraries.navigationfeaturemodule)
    implementation(Dependencies.AndroidXLibraries.corektx)
    implementation(Dependencies.AndroidXLibraries.appcompat)
    implementation(Dependencies.AndroidXLibraries.material)
    testImplementation(Dependencies.TestLibraries.junit)
    androidTestImplementation(Dependencies.TestLibraries.espresso)
}