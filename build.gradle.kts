/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api(libs.net.java.dev.jna.jna)
    testImplementation(libs.org.junit.jupiter.junit.jupiter.engine)
}

group = "de.jangassen"
version = "1.2.0"
description = "JFA"
java.sourceCompatibility = JavaVersion.VERSION_11

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
