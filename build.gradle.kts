plugins {
    `java-library`
}

java {
    sourceSets.getByName("main")
        .resources.srcDir("inventory")
}