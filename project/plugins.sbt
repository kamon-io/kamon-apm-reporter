lazy val umbrella: ProjectRef = ProjectRef(uri("git://github.com/kamon-io/kamon-sbt-umbrella.git"), "kamon-sbt-umbrella")
lazy val root: Project = project.in(file(".")).dependsOn(umbrella)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

