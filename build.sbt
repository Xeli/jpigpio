lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "eu.xeli",
      scalaVersion := "2.12.1",
      version      := "0.1.0"
    )),
    name := "JPigpio",
    crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.2"),

    //info for sonatype
    homepage := Some(url("https://github.com/Xeli/jpigpio")),
    scmInfo  := Some(ScmInfo(url("https://github.com/Xeli/jpigpio"),
                             "git@github.com:Xeli/jpigpio.git")),
    developers += Developer("Xeli",
                            "Richard Deurwaarder",
                            "richard@xeli.eu",
                            url("https://github.com/Xeli/")),
    licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
    pomIncludeRepository := (_ => false),
    publishMavenStyle := true,
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    }
  )
