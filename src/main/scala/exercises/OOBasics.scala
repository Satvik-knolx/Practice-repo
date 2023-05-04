package com.knoldus
package exercises

import scala.annotation.tailrec

object OOBasics extends App {
   private val author = new Writer("Satvik","Gupta",1998)
   println(author.fullName)
  private val novel = new Novel("Great Scala Book", 2023,author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  private val imposter = new Writer("Shivam", "Gupta", 1998)
  println(novel.isWrittenBy(imposter))

  private val counter = new Counter
  println(counter.increment)
}

class Writer(val firstName: String,val lastName: String,val yearOfBirth: Int) {
  def fullName: String = firstName + " " + lastName
}

class Novel(nameOfNovel: String, yearOfRelease: Int, author: Writer){
  def authorAge: Int = yearOfRelease - author.yearOfBirth
  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(nameOfNovel, newYearOfRelease, author )
}

class Counter(val value:Int = 0) {
  private def currentCount = value
  def increment = new Counter(currentCount + 1)
  @tailrec
  private def increment(newValue: Int): Counter = {
    if (newValue <= 0) this
    else increment.increment(newValue - 1)
  }

}