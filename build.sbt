name := "userprofile"
version := "1.0"
scalaVersion := "2.11.8"

mainClass in (Compile, run) := Some("Main")

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.0" 
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
