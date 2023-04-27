package com.knoldus
package educativePractices

object LazyLists extends App {
  private val aLazyList = 1 #:: 2 #:: LazyList.empty
  aLazyList.foreach(println)
  val result = aLazyList.find(_ > 0)
  private val anotherResult = aLazyList.filter(_ > 0)
  println(result)
  println(anotherResult)


}
