import sun.applet.Main


object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello Sai")
    
    val mulby2 : Double => Double = _ * 2
    println(mulby2(4))
  }
  
}