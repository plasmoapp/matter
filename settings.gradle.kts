pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "Matter"

include("matter-api", "matter-server")