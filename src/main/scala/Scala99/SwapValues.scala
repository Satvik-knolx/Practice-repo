package com.knoldus
package Scala99



object SwapValues extends App {
  private val tuple = (5,4)

  private def swapValues: (Int, Int) = {
    tuple.swap
  }

  println(swapValues)

}
