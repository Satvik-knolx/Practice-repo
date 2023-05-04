package com.knoldus
package educativePractices

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Palindrome extends App {
  val aString: String = readLine

  private def palindrome(aString: String): Boolean = {
    @tailrec
    def palindromeHelper(aString: String, index: Int = 0): Boolean = {
      if (index == aString.length/2) {
        aString(index) == aString(aString.length-(index + 1))
      } else {
        if (aString(index) != aString(aString.length - (index + 1)))
          false
        else
          palindromeHelper(aString, index + 1)
      }
    }
    palindromeHelper(aString)
  }
  println(palindrome(aString))
}
