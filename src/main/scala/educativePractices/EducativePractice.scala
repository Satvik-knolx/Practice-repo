package com.knoldus
package educativePractices

import scala.annotation.tailrec

object EducativePractice extends App {

  private val aVariable: Int = 12
  private val anotherVariable: String = "This variable stores a string type."
  private val variableStringInterpolation: String = "String Interpolation"
  println(aVariable)
  println(anotherVariable)
  println(s"This variable is used to show $variableStringInterpolation")

  private val myFirstVariable: Int = 100
  println(myFirstVariable)

  private val oldType: Long = 923423590
  private val newType: Float = oldType
  println(newType)

  private val anotherOldType: Char = 'A'
  private val anotherNewType: Int = anotherOldType
  println(anotherNewType)

  private val unknownVariable = 45
  println(unknownVariable.getClass)

  //  Ordinary method call
  private val someValue: String = "Hello World"
  private val resultOrdinary = someValue.indexOf("W")
  println(resultOrdinary)

  private val resultOperatorNotation = someValue indexOf 'W'
  println(resultOperatorNotation)

  val check: Int = 3
  private val compareCheck: Boolean = 8 <= check && check < 75
  println(compareCheck)

  println(~aVariable)



  val aString: String = "Hey!! \nthis is satvik"
  private val otherString: String = "Hey!!!" +
    "THis is Satvik"
  val anotherString:String =
    """Hey!!!
    This is Satvik"""

  println(aString)
  println(otherString)
  println(anotherString)
  @tailrec
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case h :: t if f(h) => dropWhile(t, f)
    case _ => l
  }
  dropWhile[Int](List(1, 2, 3, 4, 5), x => x < 4)

  private val seqCollection = Seq(1, 2, 3, 4, 5, 6)
  private val mapCollection = Map(("One", 1), ("Two", 2), ("Three", 3))
  private val setCollection = Set(1, 2, 3, 4, 5, 6)

  private val resultSeq = seqCollection.apply(2)
  private val resultSet = setCollection.apply(5)
  private val resultMap = mapCollection.apply("Two")

  println(resultSeq)
  println(resultSet)
  println(resultMap)

  seqCollection.foreach(println)

  private val colorArray = new Array[String](3)
  colorArray(0) = "red"
  colorArray(1) = "black"
  colorArray(2) = "green"
  colorArray.foreach(println)
  println(Array.range(10, 20, 2).mkString("Array(", ", ", ")"))
  private val arrayOne = Array.fill(2)("Filled")
  arrayOne.foreach(println)

  private val arrayTwo = "used toArray".toArray
  arrayTwo.foreach(println)

}

