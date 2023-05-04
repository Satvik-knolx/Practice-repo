package com.knoldus
package CaseClassImpl

class Employee(val employeeName:String,val employeeID:Int)
object Employee {
  def apply(employeeName:String,employeeID:Int): Employee = new Employee(employeeName, employeeID)
  def unapply(employee: Employee): Option[(String,Int)] ={
    Some(employee.employeeName,employee.employeeID)
  }
}

object EmployeeDetail extends App{
  private def extractor(employee: Employee): String = {
    employee match  {
      case Employee(employeeName, employeeID) => s"$employeeName,$employeeID"
      case _ => "Something Happened"
    }
  }
  private val employeeDetailObject = Employee("Satvik",1872)
  println(extractor(employeeDetailObject))
}
