name := "petname-scala"
organization := "space.piwo"
version := "0.2"

crossScalaVersions ++= Seq("2.13.16", "3.6.4")

homepage := Some(url("https://github.com/thepiwo/petname-scala"))
scmInfo := Some(ScmInfo(url("https://github.com/thepiwo/petname-scala"), "git@github.com:thepiwo/petname-scala.git"))
developers := List(Developer("thepiwo", "Philipp Piwo", "philipp@piwo.space", url("https://github.com/thepiwo")))
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
versionScheme := Some("semver-spec")

pomIncludeRepository := { _ => false }
publishMavenStyle := true
publishTo := sonatypePublishToBundle.value
