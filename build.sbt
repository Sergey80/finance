name := "finance"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Repo1" at "http://oss.sonatype.org/content/repositories/releases"

resolvers += "Repo2" at "http://repo1.maven.org/maven2"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.5" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test"
)

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)