package com.knoldus
package Scala99

import scala.annotation.tailrec

object QuestionPartOne extends App {
  private val someList = List(1, 1, 2, 3, 5, 8)
  println("last element " + someList.last)

  println("last but one " + someList(someList.length - 2))

  @tailrec
  private def nthElement(position: Int, aList: List[Int]): Option[Int] = {
    aList match {
      case Nil => None
      case head :: tail => {
        if (position < 0)
          None
        else if (position == 0)
          Some(head)
        else
          nthElement(position - 1, tail)
      }
    }
  }
  println("Element at nth position in list " + nthElement(3, someList).getOrElse())
  println("Number of element in list " + someList.length)
  @tailrec
  private def countElement(aList:List[Int], count:Int = 0): Int = {
    aList match {
      case head :: tail =>  {
        if (head == Nil)
          count
        else
          countElement(tail,count+1)
      }
    }
  }
  println(countElement(someList))
}
