name := "okasaki purely functional data structures"

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq("com.github.axel22" %% "scalameter" % "0.3")


resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
                  "releases"  at "http://oss.sonatype.org/content/repositories/releases")

scalacOptions ++= Seq("-unchecked", "-deprecation")
