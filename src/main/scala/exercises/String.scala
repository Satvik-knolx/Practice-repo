package com.knoldus
package exercises

object String extends App {
  val someString: String = "Hey!!! this is a scala program."
  println("length of string is: " + someString.length)
  println("String converted to uppercase: " + someString.toUpperCase)
  println("String reversed: " + someString.reverse)
  println("Substring of the string: " + someString.substring(8,15))

  private val splitString = someString.split(" ")
  splitString.foreach(println)
  println(someString.replace("program","exercise"))
}
