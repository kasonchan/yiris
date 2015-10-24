name := "wastewatertreatment"

version := "0.1"

scalaVersion := "2.11.7"

val akkaStreamV = "1.0"

libraryDependencies ++= Seq(
  "org.jfree" % "jfreechart" % "1.0.17",
  "org.scalatest" %% "scalatest" % "2.2.5",
  "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamV
)
