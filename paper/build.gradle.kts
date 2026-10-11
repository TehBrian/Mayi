plugins {
	id("mayi.java-conventions")
}

repositories {
	mavenCentral()
	maven("https://repo.papermc.io/repository/maven-public/")
	maven("https://maven.enginehub.org/repo/")
}

dependencies {
	api(project(":mayi-core"))

	compileOnly("org.slf4j:slf4j-api:2.0.20")
	compileOnly("org.jspecify:jspecify:1.0.1")

	compileOnly("io.papermc.paper:paper-api:26.3.build.+")

	implementation(platform("com.intellectualsites.bom:bom-newest:1.56"))
	compileOnly("com.intellectualsites.plotsquared:plotsquared-core")
	compileOnly("com.intellectualsites.plotsquared:plotsquared-bukkit") { isTransitive = false }

	compileOnly("com.sk89q.worldguard:worldguard-bukkit:7.0.19") {
		exclude(group = "org.apache.logging.log4j", module = "log4j-bom")
	}
}
