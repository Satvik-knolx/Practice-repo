package com.knoldus
package PracticeFromDoc

import scala.io.StdIn.readInt

object MatchExpression extends App {
  private val input = readInt
  private val month = input match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 =>  "October"
    case 11 =>  "November"
    case 12 =>  "December"
    case _ => "Invalid Month"
  }
  private val evenOrODd = input match {
    case even if input % 2 == 0 => "Even"
    case _ => "Odd"
  }

  private val monthDays = month match {
    case "January" | "March" | "May" |"July" | "August" | "October" | "December" => s"$month has 31 Days."
    case "February" | "April" | "June" | "September" | "November" => s"$month has less than 31 days."
    case _ => "Invalid Month"
  }
  println(month)
  println(evenOrODd)
  println(monthDays)
}
