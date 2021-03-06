resolvers += Resolver.sonatypeRepo("public")

scalacOptions := Seq("-feature", "-deprecation")

scalaVersion := "2.12.4"

fork in run := true

libraryDependencies += "net.bzzt" %% "scala-icalendar" % "0.0.1-SNAPSHOT"
libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "1.2.0" exclude("xerces", "xercesImpl")
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.3"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.13"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

assemblyMergeStrategy in assembly := {
  case x if x.endsWith("io.netty.versions.properties") => MergeStrategy.concat
  case x ⇒ 
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
