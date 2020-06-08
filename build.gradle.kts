import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    kotlin("jvm") version "1.3.72"
    `java-gradle-plugin`
}

repositories {
	jcenter()
}

tasks.withType<Test> {
    testLogging {
        events(TestLogEvent.STANDARD_OUT)
    }
}

dependencies {
    testImplementation("junit:junit:4.12")
    testImplementation(kotlin("stdlib"))
}
