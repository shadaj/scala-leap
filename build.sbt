name := "scala-leap"

organization := "me.shadaj.leap"

scalaVersion := "2.11.0"

version := "0.1"

libraryDependencies ++= Seq(
  "com.netflix.rxjava" % "rxjava-scala" % "0.17.2"
)

fork := true

javaOptions := Seq("-Djava.library.path=/Users/shadaj/Software/LeapDeveloperKit/LeapSDK/lib")