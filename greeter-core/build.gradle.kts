plugins {
    id("common-build-logic")
}

group = "com.skryvets"
version = "0.0.1"

dependencies {
    implementation(project(":greeter-utils"))
}
