object Main {
  // implicit is like a default value that is defined externally
  // to use the default value, must define it
  def greet(name: String)(implicit greeting: String){
    println(s"$greeting, $name")
  }
  def main(args: Array[String]): Unit = {
    greet("Paul")("Hello")
    // greet("Mary") // implicit, greeting must defined before can call like this
    implicit val greeting = "Hi" // must be noted as implicit
    greet("George")
  }
}
