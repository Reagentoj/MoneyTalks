rootProject.name = "Money Talks"

include (
    ":app",
    ":feature_cryptocurrencies",
    ":feature_profile",
    ":feature_stocks",
    ":feature_login",
    ":feature_splashscreen"
)

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}


include(":feature_splashscreen")
include(":navigation")
