package com.knoldus
package educativePractices

object FilterDuplicates extends App {
  private val aDuplicateList = List(1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 2, 2, 1)
  var newList: List[Int] = List()
  for (index <- 0 until aDuplicateList.length - 1) {
    if (aDuplicateList(index) == aDuplicateList(index + 1)) {
      newList = newList :+ aDuplicateList(index)
    } else if (aDuplicateList(index) != aDuplicateList(index + 1) && aDuplicateList(index) != aDuplicateList(index - 1)) {
      newList = newList :+ aDuplicateList(index)
    }
  }
  if (aDuplicateList.last != aDuplicateList(aDuplicateList.length - 2)) {
    newList = newList :+ aDuplicateList.last
  }

  println(newList)
}
