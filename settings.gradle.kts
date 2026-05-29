rootProject.name = "mayi"

projects("core", "paper")

fun projects(vararg names: String) {
	include(*names)

	names.forEach {
		project(":$it").name = "mayi-$it"
	}
}
