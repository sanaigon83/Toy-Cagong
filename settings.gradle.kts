rootProject.name = "cagong"

include("cagong-admin-api")
include("cagong-common")
include("cagong-user-api")
include("cagong-domain")

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.plugin.allopen" -> {
                    val kotlinVersion: String by settings
                    useVersion(kotlinVersion)
                }
                "org.jetbrains.kotlin.jvm" -> {
                    val kotlinVersion: String by settings
                    useVersion(kotlinVersion)
                }
                "org.jetbrains.kotlin.kapt" -> {
                    val kotlinVersion: String by settings
                    useVersion(kotlinVersion)
                }
                "org.jetbrains.kotlin.plugin.jpa" -> {
                    val kotlinVersion: String by settings
                    useVersion(kotlinVersion)
                }
                "org.jetbrains.kotlin.plugin.spring" -> {
                    val kotlinVersion: String by settings
                    useVersion(kotlinVersion)
                }
                "org.springframework.boot" -> {
                    val springBootVersion: String by settings
                    useVersion(springBootVersion)
                }
                "io.spring.dependency-management" -> {
                    val springDependencyManagementVersion: String by settings
                    useVersion(springDependencyManagementVersion)
                }
                "com.google.cloud.tools.jib" -> {
                    val jibVersion: String by settings
                    useVersion(jibVersion)
                }
                "org.asciidoctor.jvm.convert" -> {
                    val asciidoctorVersion: String by settings
                    useVersion(asciidoctorVersion)
                }
            }
        }
    }
}
