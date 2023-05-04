package com.knoldus
package educativePractices

class CreateUnapply(val name: String, val age: Int) {
}

object CreateUnapply {
  def unapply(createUnapply: CreateUnapply): Option[(String, Int)] = Some(createUnapply.name, createUnapply.age)
}

object StudentOne extends App {
  def studentDetail(createUnapply: CreateUnapply):String = {
    createUnapply match {
      case CreateUnapply(name, age) => s"$name is of $age years"
      case _ => "Invalid Name"
    }
  }


    val objOne = new CreateUnapply("Satvik", 25)
    val objTwo = new CreateUnapply("Vanshika", 25)
    println(studentDetail(objOne))
    println(studentDetail(objTwo))
}
