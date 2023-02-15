object Dependencies {

    object AppConfig {
        const val namespace = "com.reagent.moneytalks"
        const val compileSdk = 33
        const val applicationId = "com.reagent.moneytalks"
        const val minSdk = 26
        const val targetSdk = 33
        const val versionCode = 1
        const val versionName = "1.0"
        const val jvmTarget = "1.8"
    }

    object Versions {
        const val appcompat = "1.6.0"
        const val material = "1.8.0"
        const val corektx = "1.9.0"
        const val constraintlayout = "2.1.4"
        const val dagger = "2.44.2"
        const val kapt = "2.44.2"
        const val nav_version = "2.5.3"
        const val retrofit = "2.9.0"
        const val room = "2.5.0"

        const val junit = "4.13.2"
        const val espresso = "3.5.1"
    }

    object Modules {
        const val app = ":app"
        const val stocks = ":feature_stocks"
        const val login = ":feature_login"
        const val cryptocurrencies = ":feature_cryptocurrencies"
        const val profile = ":feature_profile"
        const val splashscreen = ":feature_splashscreen"
        const val navigation = ":navigation"
        const val finance = ":feature_finance"
    }

    object AndroidXLibraries {
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val corektx = "androidx.core:core-ktx:${Versions.corektx}"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
        const val navigationfragment ="androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
        const val navigationui = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
        const val navigationdynamicfeaturemodule = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.nav_version}"
    }

    object Libraries {
        const val roomruntime = "androidx.room:room-runtime:${Versions.room}"
        const val roomktx = "androidx.room:room-ktx:${Versions.room}"
        const val roomap = "androidx.room:room-compiler:${Versions.room}"
        const val roomkapt = "androidx.room:room-compiler:${Versions.room}"

        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitconverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val daggercompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val kapt = "com.google.dagger:dagger-compiler:${Versions.kapt}"
    }

    object TestLibraries {
        const val junit = "junit:junit:${Versions.junit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

}