package com.knoldus
package educativePractices

object Curried extends App {

  def sum(elementOne: Int)(elementTwo: Int) = elementOne + elementTwo

  println(sum(3)(4))

  private def aSum(aFunction: Int => Int)(elementOne: Int, elementTwo: Int): Int = {
    if (elementOne > elementTwo)
      0
    else
      aFunction(elementOne) + aSum(aFunction)(elementOne + 1, elementTwo)
  }
  println(aSum(element => element + element)(1,5))
}
