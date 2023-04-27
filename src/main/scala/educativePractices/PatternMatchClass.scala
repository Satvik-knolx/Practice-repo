package com.knoldus
package educativePractices

import java.lang.Number

object PatternMatchClass extends App {
  //  val aTime = readLine()
  //  aTime match {
  //    case (8 < aTime and aTime < 10) => println("Breakfast")
  //    case (12 < aTime and aTime < 15) => println("Lunch")
  //    case (20 < aTime and aTime < 22) => println("Dinner")
  //    case _ => println("Food timing is not yet achieved")
  //  }

  private val aConstantPattern: Any = 75
  aConstantPattern match {
    case 75 => println(s"matched with $aConstantPattern")
    case "Hello" => println("matched with Hello")
    case true => println("matched with true")
    case _ => println("default case")
  }

   private val aSequencePattern = Array(1,2,3,4,5)
   aSequencePattern match {
     case Array(2,_,_,_,_) => println("caseOne")
     case Array(1,_,_,_,_) => println("caseTwo")
     case Array(_,_,_,_,5) => println("caseThree")
   }

  private val aTuplePattern:Any = ("hey","they","lay")
  aTuplePattern match {
    case (_,"lay",_) =>println("caseOne")
    case (_,_,"they") =>println("caseTwo")
    case ("hey",_,_) =>println("caseThree")
    case _ => println("Default Case")
  }

  private val aTypedPattern: Any = "educative"
  aTypedPattern match {
    case stringType:String => println("String typed matched")
    case intType:Int => println("Int typed matched")
    case _ => println("Default case matched")
  }
}
