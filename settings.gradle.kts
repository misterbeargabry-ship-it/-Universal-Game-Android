pluginManagement { repositories { google(); mavenCentral(); gradlePluginPortal() } }
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) {
        repositories { google(); mavenCentral() }
    }
}
rootProject.name = "UniversalGame"
include(":app")
