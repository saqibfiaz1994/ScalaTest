package app

import scala.io.StdIn

object GreeterApplication extends App {
object Prompt {
  def ask(message: String) = StdIn.readLine(message)
}
  class Person (val name : String)
  val nonames = Prompt.ask("what is your name?")
  val p = new Person("george")

    def greet(name : String) :	Unit	=	{

      if	(name	==	p.name)	{

        println("You don't get a hello!")

      }	else	{

        println(s"Hello $name")
      }

    }
  greet(nonames)
}
