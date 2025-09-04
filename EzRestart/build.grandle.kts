plugins {
    java
    id("io.papermc.paperweight.userdev") version "1.7.1" // latest stable
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle("1.21.8-R0.1-SNAPSHOT")
    implementation("com.github.legendmarkosgr-boop:ezrestart0:Tag")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // Paper 1.21.x requires Java 21
    }
}

tasks {
    jar {
        archiveBaseName.set("ezrestart")
    }
}
