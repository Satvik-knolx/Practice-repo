package com.knoldus
package CaseClassImpl

object HigherOrderFunction extends App {
  def sum(function: Int => Int, elementOne: Int, elementTwo: Int): Int = {
    if (elementOne > elementTwo)
      0
    else
      elementOne + sum(function, elementOne + 1, elementTwo)
  }

  private def sumOfIntegers(elementOne:Int, elementTwo:Int):Int = sum(function => function,elementOne, elementTwo)

  println(sumOfIntegers(1,5))
}
