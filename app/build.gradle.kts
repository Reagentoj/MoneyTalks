plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = Dependencies.AppConfig.namespace
    compileSdk = Dependencies.AppConfig.compileSdk

    defaultConfig {
        applicationId = Dependencies.AppConfig.applicationId
        minSdk = Dependencies.AppConfig.minSdk
        targetSdk = Dependencies.AppConfig.targetSdk
        versionCode = Dependencies.AppConfig.versionCode
        versionName = Dependencies.AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
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

    implementation(project(Dependencies.Modules.login))
    implementation(project(Dependencies.Modules.profile))
    implementation(project(Dependencies.Modules.cryptocurrencies))
    implementation(project(Dependencies.Modules.stocks))
    implementation(project(Dependencies.Modules.splashscreen))

    implementation(Dependencies.Libraries.dagger)
    kapt(Dependencies.Libraries.daggercompiler)

    implementation(Dependencies.AndroidXLibraries.corektx)
    implementation(Dependencies.AndroidXLibraries.appcompat)
    implementation(Dependencies.AndroidXLibraries.material)
    implementation(Dependencies.AndroidXLibraries.constraintlayout)
    implementation(Dependencies.AndroidXLibraries.navigationui)
    implementation(Dependencies.AndroidXLibraries.navigationfeaturemodule)
    implementation(Dependencies.AndroidXLibraries.navigationfragment)

    testImplementation(Dependencies.TestLibraries.junit)
    androidTestImplementation(Dependencies.TestLibraries.espresso)
}