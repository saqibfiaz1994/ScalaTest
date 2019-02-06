package app

import scala.io.StdIn

object GreeterApplication extends App {
  class Person (val name : String)
  val nonames = StdIn.readLine("What is your name?")
  val p = new Person("george")

    def greet(name : String) :	Unit	=	{

      if	(name	==	p.name)	{

        println(s"You don't get a hello!")

      }	else	{

        println(s"Hello $name")
      }

    }
  greet(nonames)
}
