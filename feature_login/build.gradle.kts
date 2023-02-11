plugins {
    id ("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "com.example.feature_login"
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

    implementation ("com.google.dagger:dagger:2.44.2")
    kapt ("com.google.dagger:dagger-compiler:2.44.2")

    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.appcompat:appcompat:1.6.0")
    implementation ("com.google.android.material:material:1.8.0")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
}