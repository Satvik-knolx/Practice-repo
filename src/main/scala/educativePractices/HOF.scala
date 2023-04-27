package com.knoldus
package educativePractices

import scala.annotation.tailrec

class Hof {
  //  def cube(element: Int): Int = {
  //    element * element * element
  //  }
  //
  //  def sumOfCubes(elementOne: Int, elementTwo: Int): Int = {
  //    if (elementOne > elementTwo)
  //      0
  //    else
  //      cube(elementOne) + sumOfCubes(elementOne + 1, elementTwo)
  //  }
  //
  //  def factorial(value:Int): Int = {
  //    if (value == 0)
  //      1
  //    else
  //      factorial(value - 1) * value
  //  }
  //  def sumOfFactorials(elementOne: Int, elementTwo: Int): Int = {
  //    if(elementOne>elementTwo)
  //      0
  //    else
  //      factorial(elementOne) + sumOfFactorials(elementOne + 1, elementTwo)
  //  }
  private def sum(function: Int => Int, elementOne: Int, elementTwo: Int): Int = {
    if (elementOne > elementTwo)
      0
    else
      function(elementOne) + sum(function,elementOne+1,elementTwo)
  }

  private def anotherSum(function:Int => Int): (Int,Int) => Int = {
    def sumHelper(elementOne:Int,elementTwo:Int):Int =
      if (elementOne > elementTwo)
        0
      else
        function(elementOne) + sumHelper(elementOne+1, elementTwo)
    sumHelper
  }
  private def factorialElement(element:Int):Int = {
    if(element == 0)
      1
    else
      element * factorialElement(element - 1)
  }

  def anotherSumOfInt: (Int, Int) => Int = anotherSum(element => element)

//  private def anotherCubeOfInt: Int = anotherSum(element => element * element * element)


//  private def id(element:Int) = element
//  private def cube(element: Int): Int = element * element * element
  private def factorial(element: Int): Int = if(element == 0) 1 else factorial(element - 1) * element

  def sumOfInts(elementOne:Int,elementTwo:Int): Int = sum(summation=>summation,elementOne,elementTwo)
  def sumOfCubes(elementOne:Int,elementTwo:Int): Int = sum(element => element*element*element,elementOne,elementTwo)

  def sumOfFactorial(elementOne: Int,elementTwo: Int): Int = sum(factorial, elementOne, elementTwo)


}


object MainFunction {

  def main(args: Array[String]): Unit = {
    val hofObj = new Hof
//    println(hofObj.sumOfCubes(1, 5))
//    println(hofObj.sumOfFactorials(1, 5))
    println(hofObj.sumOfInts(1,5))
    println(hofObj.sumOfCubes(1,5))
    println(hofObj.sumOfFactorial(1,5))
  }

}

