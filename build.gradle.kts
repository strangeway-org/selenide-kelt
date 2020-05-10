plugins {
    java
    kotlin("jvm") version "1.3.72"
    `maven-publish`
}

group = "org.strangeway"
version = "1.0.0"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.codeborne:selenide:5.11.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.strangeway"
            artifactId = "selenide-kotlin-ext"
            version = "1.0.0"

            from(components["java"])

            pom {
                name.set("Selenide Kotlin Ext")
                description.set("Extension functions to make Selenide tests with Kotlin awesome")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("jreznot")
                        name.set("Yuriy Artamonov")
                        email.set("jreznot@yandex.ru")
                    }
                }
            }
        }
    }
}