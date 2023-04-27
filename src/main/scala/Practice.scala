package com.knoldus

object Practice extends App {

  //    def lastButOneElement : Int ={
  //      for(element <- list.length-1 ){
  //
  //      }
  //    }
  val aString = "re"
  val anotherString = "fg"


  val result = aString.compareTo(anotherString)

  private val list = List(1, 2, 3, 4, 5)

  private def lastElement: Int = {
    list.last
  }
  println(lastElement)

  println(result)
}
