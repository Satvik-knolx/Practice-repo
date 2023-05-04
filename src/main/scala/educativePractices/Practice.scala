
package com.knoldus
package educativePractices

import scala.io.StdIn.readInt


object Practice extends App {
  private val aList = List(1, 2, 3, 4, 5)
  private val indexToRemoveElement: Int = readInt()
  private val newList = indexToRemoveElement match {
    case validIndex if validIndex > 0 && validIndex < aList.length => {
      val element = aList(indexToRemoveElement)
      val filteredList = aList.filterNot(_ == element)
      val result = filteredList :+ element
      (result, element)
    }
    case invalidIndex if invalidIndex < 0 || invalidIndex >= aList.length => println("Index is invalid")
  }
  println(newList)
}