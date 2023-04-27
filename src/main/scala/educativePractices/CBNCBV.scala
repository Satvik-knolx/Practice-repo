package com.knoldus
package educativePractices

import scala.annotation.tailrec

object CBNCBV extends App {

  @tailrec
  private def loop: Int = loop

//  infinite loop as y is also evaluated
//  def accessFirst(x:Int, y:Int) = x
private def accessFirst(x: Int, y: => Int) = x   //in this y is not evaluated so its returning x
  val result = accessFirst(1,loop)
  println(result)

}
