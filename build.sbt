name := "petname-scala"
organization := "space.piwo"
version := "0.1-SNAPSHOT"
scalaVersion := "2.12.6"

homepage := Some(url("https://github.com/thepiwo/petname-scala"))
scmInfo := Some(ScmInfo(url("https://github.com/thepiwo/petname-scala"), "git@github.com:thepiwo/petname-scala.git"))
developers := List(Developer("thepiwo", "Philipp Piwo", "philipp@piwo.space", url("https://github.com/thepiwo")))
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
publishMavenStyle := true

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)
