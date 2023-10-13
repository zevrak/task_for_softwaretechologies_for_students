plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

apply(plugin = "java")

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

sourceSets {
    main {
        java.srcDir("src/main/java")
    }

    test {
        java.srcDir("src/test/java")
    }
}

configurations {
    implementation {
        resolutionStrategy.failOnVersionConflict()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_18
    targetCompatibility = JavaVersion.VERSION_18
}


tasks {
    test {
        testLogging.showExceptions = true
        useJUnit()
        useJUnitPlatform()
    }
}