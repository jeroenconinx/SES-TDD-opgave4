plugins {
    kotlin("jvm") version "1.5.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation("org.hamcrest:hamcrest-core:2.2")
    testImplementation("org.mockito:mockito-core:4.3.1")

}

tasks.test {
    useJUnitPlatform()
}
