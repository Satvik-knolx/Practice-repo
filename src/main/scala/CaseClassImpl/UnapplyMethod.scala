package com.knoldus
package CaseClassImpl

class UnapplyMethod(val name: String,val age:Int)

object UnapplyMethod  {
  def apply(name:String,age:Int):UnapplyMethod = new UnapplyMethod(name: String,age)

  def unapply(unapplyMethod: UnapplyMethod):Option[(String,Int)] = {
   Some(unapplyMethod.name,unapplyMethod.age)
  }
}

object Person extends App{
  def extractor (unapplyMethod: UnapplyMethod): String = {
    unapplyMethod match {
      case UnapplyMethod(name,age) => s"$name,$age"
      case _ => "Not found name or age"
    }
  }

  private val personObject = UnapplyMethod
  println(extractor(personObject("Satvik",25)))
}
