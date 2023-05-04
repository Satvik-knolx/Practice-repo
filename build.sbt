ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Rock-JVM-Practice",
    idePackagePrefix := Some("com.knoldus")
  )
libraryDependencies += "org.scalanlp" %% "breeze" % "2.1.0"

