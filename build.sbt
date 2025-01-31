val dottyVersion = "0.19.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "org.typelevel",
    name := "spotted-leopards",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := dottyVersion,
    scalacOptions += "-language:strictEquality",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
