package app

import scala.io.StdIn

object GreeterApplication extends App {

  def greet(name : String) : Unit	=	println(s"Hello $egg")

    val egg = StdIn.readLine("What is your name?")


    greet(egg)

}
