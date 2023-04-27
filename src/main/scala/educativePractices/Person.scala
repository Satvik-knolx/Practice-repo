package com.knoldus
package educativePractices

class Person(var name:String,var age:Int,var gender: String) {

  private var years = 15
  private def talking = println(s"$name is talking")
  private val personobj = new Person("satvik", 25,"male")
  println(personobj)
  personobj.talking
}