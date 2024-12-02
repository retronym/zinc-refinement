scalaVersion := "2.13.15"

val p1 = project

val p2 = project.dependsOn(p1)
