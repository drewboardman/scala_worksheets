object test {
  println("Welcome to the Scala worksheet")

  val f: PartialFunction[String, String] = { case "ping" => "pong" }
  f("ping")
  f.isDefinedAt("abc")
  f.isDefinedAt("ping")
}