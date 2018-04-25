package com.clearscore

import scala.scalajs.js
import scala.scalajs.js.annotation._

object HelloWorld {
  type Callback = js.Function2[Error, js.Any, Unit]
  type Handler = js.Function3[js.Any, js.Any, Callback, Unit]

  @JSExportTopLevel("sayHello")
  val sayHello: Handler = { (event, context, callback) =>
    callback(null, "Hello World!")
  }
}
