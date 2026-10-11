plugins {
	id("mayi.java-conventions")
}

repositories {
	mavenCentral()
}

dependencies {
	compileOnly("org.slf4j:slf4j-api:2.0.20")
	compileOnly("org.jspecify:jspecify:1.0.1")
}
