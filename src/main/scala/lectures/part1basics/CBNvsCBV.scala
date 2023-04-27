package com.knoldus
package lectures.part1basics

object CBNvsCBV extends App {
  def calledByValue(number: Long): Unit = {
    println("called by name: " + number)
    println("called by name: " + number)
    //    println("called by value: " + 59515427368043L)
    //    println("called by value: " + 59515427368043L)
  }

  def calledByName(number: => Long): Unit = {
    println("called by name: " + number)
    println("called by name: " + number)
    //    println("called by name: " + System.nanoTime())
    //    println("called by name: " + System.nanoTime())
  }

  calledByName(System.nanoTime())
  calledByValue(59515427368043L)

  def infinite(): Int = 1 + infinite()

  def printFirst(aNumber: Int, anotherNumber: => Int) = println(aNumber)

//  printFirst(infinite(), 34)
  printFirst(34, infinite())
}
