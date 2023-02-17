// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.0" apply false
    id("com.android.library") version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
    id ("com.google.dagger.hilt.android") version "2.45" apply false
}

buildscript{
    dependencies{
        classpath(Dependencies.Libraries.hiltplugin)
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}