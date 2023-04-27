package com.knoldus
package educativePractices

object FunctionsClass extends App {
  private def sum(x:Int, y:Int):Int = {
    x+y
  }
  println(sum(3,7))

  def square(element:Int):Int = {
    element * element
  }

  def sumOfSquare(elementOne:Int, elementTwo:Int):Int = {
    square(elementOne) + square(elementTwo)
  }

  println(sumOfSquare(3,4))

  def absolute(x:Int):Int = {
    if (x < 0)  {
      x * -1
    } else
      x
  }

  println(absolute(24))
  println(absolute(-24))

}
