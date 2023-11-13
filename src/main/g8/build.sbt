val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
  guice,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test,
  "org.playframework" %% "play-slick" % "6.0.0-M2",
  "com.h2database" % "h2" % "1.4.200",
  "ch.qos.logback" % "logback-classic" % "0.9.28" % "test",
  "org.postgresql" % "postgresql" % "42.5.1",
  filters,
)
  )
