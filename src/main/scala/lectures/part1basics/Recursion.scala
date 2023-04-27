package com.knoldus
package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def aFactorial(number: Int): Int = {
    if (number <= 1)
      1
    else {
      println("Computing factorial of " + number + " but first need to compute factorial of " + (number - 1))
      val result = number * aFactorial(number - 1)
      println("Computed factorial of " + result)
      result
    }
  }

  aFactorial(6)

  def anotherFactorial(number: Int): BigInt = {
    def factorialHelper(anotherNumber: Int, accumulator: BigInt): BigInt = {
      if (anotherNumber <= 1)
        accumulator
      else {
        factorialHelper(anotherNumber - 1, accumulator * anotherNumber)
      }
    }

    factorialHelper(number, 1)
  }

  println(anotherFactorial(5000))

  def concatenate(name: String, times: Int, accumulator: String): String = {
    if (times == 1) {
      accumulator
    } else {
      concatenate(name, times - 1, name + accumulator)
    }
  }

  println(concatenate("Hey ", 5, ""))

  def isPrime(number: Int): Boolean = {
    @tailrec
    def isPrimeUntil(divisor: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime)
        false
      else if (divisor <= 1)
        true
      else
        isPrimeUntil(divisor - 1, number % divisor != 0 && isStillPrime)

    isPrimeUntil(number / 2, isStillPrime = true)
  }

  println(isPrime(5))
  println(isPrime(6))

  def fibonacci(number: Int): Int = {
    def fibonacciTail(index: Int, last: Int, nextToLast: Int): Int = {
      if (index >= number)
        last
      else
        fibonacciTail(index + 1, last + nextToLast, last)
    }

    if (number <= 2)
      1
    else
      fibonacciTail(2, 1, 1)
  }

  println(fibonacci(8))
}
