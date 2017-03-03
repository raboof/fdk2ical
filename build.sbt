resolvers += Resolver.sonatypeRepo("public")

scalacOptions := Seq("-feature", "-deprecation")

scalaVersion := "2.12.1"

fork in run := true

libraryDependencies += "net.bzzt" %% "scala-icalendar" % "0.0.1-SNAPSHOT"
libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "1.2.0"
libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.12.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
