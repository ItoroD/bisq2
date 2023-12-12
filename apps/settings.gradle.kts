pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    includeBuild("../build-logic")
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

includeBuild("..")

include("desktop")
include("desktop-app")
include("desktop-app-launcher")
include("oracle-node")
include("oracle-node-app")
include("rest-api-app")
include("seed-node-app")

rootProject.name = "apps"