package com.knoldus
package lectures.part2oops

object OOBasics extends App {
  val person = new Person("Satvik", 25)
  println(person.age)
  person.greet("Sheshnath")
}

//class Person(name: String, age: Int) If it is defined like this then person.age will show error as it cannot access class parameter as fields
class Person(val name: String,val age: Int) {  //added var or val keyword which resulted in the accessibility of parameter as a field in person.age
  //  body of the class within the curly braces '{' and '}'
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")
}