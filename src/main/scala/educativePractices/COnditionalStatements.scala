package com.knoldus
package educativePractices

import scala.io.StdIn.readLine

object COnditionalStatements extends App {
  val aInput = readLine()

  val fileName = if (aInput.nonEmpty) aInput else "Name"
  println(fileName)

    for (i <- 1 to 5) {
      println(s"iteration $i")
    }


  val colorArray = Array("red", "blue", "yellow")
  for (color <- colorArray) {
    println(color)
  }
  private val newArra = {
    for (color <- colorArray)
      yield color.toUpperCase()
  }

  for(element <- newArra)
    println(element)

  val someNewArray = Array(1,2,3,4,5,6)
  val result = {
    for (element <- someNewArray if element % 2 == 0)
      yield element
  }

  for(res <- result)
    yield println(res)

  val testArray = Array(1,2,3)
  val squareArray = {
    for (element <- testArray)
      yield element * element
  }
  squareArray.foreach(println)



}
