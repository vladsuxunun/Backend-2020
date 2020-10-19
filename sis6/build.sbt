name := "sis6"

version := "0.1"

scalaVersion := "2.13.3"
val AkkaVersion = "2.6.10"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
// https://mvnrepository.com/artifact/org.slf4j/slf4j-jdk14
libraryDependencies += "org.slf4j" % "slf4j-jdk14" % "1.8.0-beta4" % Test

