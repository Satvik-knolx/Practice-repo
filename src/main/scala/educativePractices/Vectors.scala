package com.knoldus
package educativePractices

object Vectors extends App {

  private val aVector = Vector(1,2,3,4,5)
  aVector.foreach(println)
  println(aVector(3))

  private val aRange = 1 to 10
  aRange.foreach(println)

  private val anotherRange = 1 to 10 by 2
  anotherRange.foreach(println)

  private val someOtherRange = 1 until 5
  someOtherRange.foreach(println)
}
