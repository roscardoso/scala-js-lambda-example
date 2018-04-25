enablePlugins(ScalaJSPlugin)

name := "scala-js-lambda-example"
scalaVersion := "2.12.5"

// This is an application with a main method
scalaJSUseMainModuleInitializer := false

scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }
