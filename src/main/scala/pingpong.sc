object test {
  println("Welcome to the Scala worksheet")

  val f: String => String = { case "ping" => "pong" }
  f("ping")
  f("abc")
}