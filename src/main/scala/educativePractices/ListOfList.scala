package com.knoldus
package educativePractices

import educativePractices.UnapplyMethod.unapply

class UnapplyMethod(val name:String,val age:Int)

object UnapplyMethod  {

  def apply(name: String, age: Int): UnapplyMethod = new UnapplyMethod(name,age)
  def unapply(unapplyMethod: UnapplyMethod): Option[(String,Int)] ={
     Some(unapplyMethod.name,unapplyMethod.age)
  }
}
object SomePerson  extends App {
  def extractor(unapplyMethod: UnapplyMethod) : String = {
    unapplyMethod match {
      case UnapplyMethod(name,age) => s"$name, $age"
      case _ => "invalid name and age"
    }
  }
  private val objectOne = UnapplyMethod("Satvik",25)
  println(unapply(objectOne))
}
  