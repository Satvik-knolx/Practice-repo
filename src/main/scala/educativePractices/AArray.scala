package com.knoldus
package educativePractices

import scala.::
import scala.collection.mutable.ArrayBuffer

object AArray extends App {
  private val aArrayBuffer = ArrayBuffer(1,2,3,4,5)
  aArrayBuffer.foreach(println)

  val newArrayBuffer = new ArrayBuffer[Int]()
  newArrayBuffer += 6
  newArrayBuffer += 12
  newArrayBuffer += 13
  newArrayBuffer += 24
  newArrayBuffer += 4
  newArrayBuffer += 45
  newArrayBuffer += 6

  newArrayBuffer.foreach(println)
  newArrayBuffer -= 45
  newArrayBuffer -= 46


  newArrayBuffer.foreach(println)

  newArrayBuffer.length

  newArrayBuffer.remove(5)
  newArrayBuffer.clear()
  newArrayBuffer.foreach(println)
  val list = List
  private val aList =  List("apple","banana","orange",Nil)
  private val anotherList = "apple"::"banana"::"orange"::Nil
  aList.foreach(print)
  println()
  anotherList.foreach(println)
  private val anotherListTwo = anotherList :+ "grapes"
  println(anotherListTwo)
  private val anotherListThree = "Fruits" +: anotherListTwo
  println(anotherListThree)
  private val someOtherList = List.empty ::: anotherListThree
  println(someOtherList)
  private val someMoreOtherList = anotherList:: someOtherList :: anotherListThree

  someMoreOtherList.foreach(print)
}
