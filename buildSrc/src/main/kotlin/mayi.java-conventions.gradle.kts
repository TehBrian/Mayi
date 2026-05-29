plugins {
	`java-library`
	id("net.kyori.indra")
	id("net.kyori.indra.checkstyle")
	id("net.kyori.indra.publishing")
}

group = rootProject.group
version = rootProject.version
description = rootProject.description

indra {
	javaVersions {
		target(25)
	}

	github("TehBrian", "Mayi")

	mitLicense()

	publishReleasesTo("tehbrian", "https://repo.tehbrian.dev/releases")
	publishSnapshotsTo("tehbrian", "https://repo.tehbrian.dev/snapshots")

	configurePublications {
		pom {
			developers {
				developer {
					id.set("TehBrian")
					url.set("https://tehbrian.dev")
					email.set("tehbrian@proton.me")
				}
			}
		}
	}
}
