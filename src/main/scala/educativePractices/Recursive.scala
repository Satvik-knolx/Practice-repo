package com.knoldus
package educativePractices

import scala.annotation.tailrec

object Recursive extends App {
  private def factorial(number: Int): Int = {
    if (number == 1)
      1
    else
      number * factorial(number - 1)
  }

  println(factorial(4))

  private def factorialPattern(number: Int): Int = number match {
    case 1 => 1
    case number => number * factorialPattern(number - 1)
  }
  println(factorialPattern(4))

  private val numberList = List(1,2,3,4,5)
  def sum(numberList: List[Int]):Int = numberList match {
    case Nil => 0
    case numberList :: tail => numberList + sum(tail)
  }
  println(sum(numberList))

  private def abs(x: Double) =
    if (x < 0) -x else x

  private def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.0001

  private def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  @tailrec
  private def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  private def sqrt(x: Double):Int = sqrtIter(1.0, x).toInt
  println(sqrt(4))

  private def mainMax(a: Int, b: Int, c: Int): Int = {
    // Write your code here
    def max(a:Int,b:Int): Int = {
      if (a > b)
        a
      else
       b
    }
    max(a, max(b, c))
  }
  println(mainMax(3,4,5))
}

