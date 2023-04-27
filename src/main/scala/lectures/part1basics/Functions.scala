package com.knoldus
package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterLessFunction: Int = 42
  //  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 0)
      aString
    else
      aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hello ", 4))

  def aGreetingFunction(name: String, age: Int) = {
    s"Hey this is $name and I am $age years old"
  }

  println(aGreetingFunction("Satvik", 25))

  def aFactorial(number: Int): Int = {
    if (number < 2) {
      number
    } else {
      number * aFactorial(number - 1)
    }
  }

  println(aFactorial(5))

  def aFibonacci(number: Int): Int = {
    if (number <= 0)
      throw new Exception("Number should be greater than zero")

    else if (number <= 2)
      1
    else
      aFibonacci(number - 1) + aFibonacci(number - 2)
  }

  println(aFibonacci(6))

  def aPrime(number: Int): Boolean = {
    def isPrime(divisor: Int): Boolean = {
      if (divisor <= 1) {
        true
      } else {
        number % divisor != 0 && isPrime(divisor - 1)
      }
    }

    isPrime(number / 2)
  }

  println(aPrime(5))
  println(aPrime(6))

}
