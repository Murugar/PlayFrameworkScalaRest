import sbt.Keys._



scalaVersion := "2.11.11"

resolvers ++= Seq(
  "webjars"    at "http://webjars.github.com/m2"
)

libraryDependencies ++= Seq(
  "org.webjars"               %% "webjars-play"       % "2.3.0",
  "org.webjars"               % "bootstrap"           % "3.0.0" exclude("org.webjars", "jquery"),
  "org.webjars"               % "jquery"              % "1.8.3"
)

libraryDependencies += "com.netaporter" %% "scala-uri" % "0.4.14"
libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.0"

    
lazy val root = (project in file("."))
  .enablePlugins(Common, PlayScala)
 
