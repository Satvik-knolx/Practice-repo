package com.knoldus
package lectures.part2oops

object MethodNotations extends App {
  private val mary = new APerson("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")           // Both are equivalent
  private val tom = new APerson("Tom", "Fight Club")
  println(mary.hangsOutWith(tom))
  println(mary hangsOutWith tom)           // Both are equivalent
}


class APerson(val name: String, favouriteMovie: String) {
  def likes(movie: String): Boolean = movie == favouriteMovie

  def hangsOutWith(person: APerson): String = s"${this.name} is hanging out with ${person.name}"
}
