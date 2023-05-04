package com.knoldus
package educativePractices


object COL extends App {
  val mySetOne: Set[Int] = Set(1, 3, 4, 5, 6, 7, 8)
  val mySetTwo: Set[Int] = Set(2, 4,6, 7, 39, 23, 34)
//  val result = mySetOne.toList
//  mySetOne.foreach(println)
  val result = mySetOne.intersect(mySetTwo)
  val resutlTwo = mySetOne.union(mySetTwo)


  result.foreach(println)
  resutlTwo.foreach(println)
//  result.foreach(println)
//  println(result(3))
}
