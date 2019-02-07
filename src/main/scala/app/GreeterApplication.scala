package app

import scala.io.StdIn

object GreeterApplication extends App {
object Prompt {


  def ask(message: String) = StdIn.readLine(message)

}
  class Person (val name : String, age : Int)
  private val	years	:	String	=	if(age	== 1)	"year" else "years"


  val names = Prompt.ask("what is your name?")
    val age = Prompt.ask("how old are you?").toInt
    val p = new Person("george", age)

  def greet(name : String) :	Unit	=	{

      if	(name	==	p.name) {
        println("You don't get a hello!")


      } else	{

        println(s"Hello $name, you are $age $years old")
      }

    }
  greet(names)
}
