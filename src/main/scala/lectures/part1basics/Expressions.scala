package com.knoldus
package lectures.part1basics

object Expressions extends App {
  def check = {
    2 < 3
  }

  def checkCondition  = {
    if (check) 42 else 123
    26
  }
  checkCondition

  println(sum)
  println(sum * 4)

  private def sum: Int = {
    val x = 1 + 2
    x
  }

}
