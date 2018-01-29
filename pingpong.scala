package week8

object test {
  println("Welcome to the Project worksheet")
  val f: String => String = { case "ping" => "pong" }

  f("ping")
  f("abc")
}
