name := "test-package"

organization := "com.hmgomes.test-package"

// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.11.8"

crossPaths := false  // suppress the scala version number suffix on artifacts

sparkVersion := "2.3.2"

spName := "hmgomes/test-package"

spShortDescription := "Testing spark-packages publishing, please ignore"

spDescription := "This is a test package, please ignore this package"

// Don't forget to set the version
version := "0.0.2"

// All Spark Packages need a license
licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

spIncludeMaven := false

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")

// Add Spark components this package depends on, e.g, "mllib", ....
// sparkComponents ++= Seq("sql", "mllib")
sparkComponents ++= Seq("streaming")

// uncomment and change the value below to change the directory where your zip artifact will be created
spDistDirectory := target.value

// libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.6.3"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test"

// add any Spark Package dependencies using spDependencies.
// e.g. spDependencies += "databricks/spark-avro:0.1"
