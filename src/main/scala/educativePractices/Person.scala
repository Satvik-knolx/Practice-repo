package com.knoldus
package educativePractices

case class Person(name: String, age: Int)

object Student extends App {


  private val objOne = Person("Satvik", 25)
  private val objTwo = objOne.copy("Vanshika")

  private def studentDetail(person: Person): String = {
    person match {
      case Person(name, age) => s"Name of student is $name and $age years old"
      case _ => "Student detail doesn't exist"
    }
  }
  println(studentDetail(objOne))
  println(studentDetail(objTwo))
  println( objOne.equals(objTwo))
  println(Person.unapply(objOne))
}

