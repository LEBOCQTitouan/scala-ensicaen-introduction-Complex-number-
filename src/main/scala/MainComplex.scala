object MainComplex {
  def main(args: Array[String]) = {
    println("test display")
    val rand = new scala.util.Random
    for( x <- 1 to 10){
      val c: Complex = Complex(rand.nextInt(), rand.nextInt())
      println(s"\t${c}")
    }
  }
}