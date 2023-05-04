package com.knoldus
package lectures.part1basics

object StringOps extends App {
  private val someString = "Hello, I am here to learn scala!!!"

  println(someString.charAt(3))
  println(someString.substring(3,8))
  println(someString.split(" ").toList)
  println(someString.startsWith("Hello"))
  println(someString.replace(" ", "__"))
  println(someString.toLowerCase)
  println(someString.length)
  private val aString = "34"
  val anotherString = aString.toInt
  println(anotherString.getClass)

    private val someOtherString = "A String is given!!!"
  someOtherString.foreach(println)
//  it is equivalent to

  for(characters <- someOtherString)
    println(characters)

  someOtherString.getBytes.foreach(println)

  val result = someOtherString.filter(_ != '!')
  println(result)
  println(someOtherString.drop(2))
  println(someOtherString.contains("S"))
  println(someOtherString.capitalize)
  println(someOtherString.toUpperCase)
  private val comparableStringOne = "Hello"
  private val comparableStringTwo = "Hello"
  private val comparableStringThree = comparableStringOne
  private val comparableStringFour = "H" + "ello"
  println(comparableStringOne == comparableStringTwo)
  println(comparableStringOne == comparableStringThree)
  println(comparableStringOne == comparableStringFour)
  println(comparableStringOne eq comparableStringTwo)
  println(comparableStringOne eq comparableStringThree)
  println(comparableStringOne eq comparableStringFour)
  println(comparableStringOne equals  comparableStringTwo)
  println(comparableStringOne equals  comparableStringThree)
  println(comparableStringOne equals  comparableStringFour)

  private val multiLineString =
    """This is
      |a multiline
      |string .""".stripMargin

  println(multiLineString)

  private val foods = "milk, butter, choco, butter"

  private val someResult = foods.split("\\s+")
  someResult.foreach(println)

  val anotherResult = foods.filter(_ != ',')
  println(anotherResult)

//  for(elements <- foods)
//    if(elements != ',')
//      print(elements)
  for {
    elements <- foods
    if elements != ','
  } yield print(elements)

  println()
  private val oneMoreResult = foods.map {
    element => if (element != ' ' | element != ',')
      (element.toByte-32).toChar
  }.filter(_.toString != " ").mkString("")

  println(oneMoreResult)

  private val numPattern = "[0-9]+".r
  private val someAddress = "123 main Street block 207910"
  private val firstPattern = numPattern.findFirstIn(someAddress)
  firstPattern match {
    case Some(value) => println(value)
    case None => "No values found"
  }
  private val allPattern = numPattern.findAllIn(someAddress)
//  println(firstPattern)
  allPattern.foreach(println)
  private val regex = "[0-9]".r
  println(regex.replaceAllIn(someAddress,"x"))

  println(someAddress.reverse)
  println(("Address: " +: someAddress :+ " Verified").mkString(""))

}
