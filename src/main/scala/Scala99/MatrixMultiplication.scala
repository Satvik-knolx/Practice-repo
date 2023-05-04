package com.knoldus
package Scala99
import breeze.linalg._

object MatrixMultiplication extends App {



  // create two matrices
  private val matrixOne = DenseMatrix((1, 2), (3, 4), (5, 6))
  private val matrixTwo = DenseMatrix((7, 8, 9), (10, 11, 12))

  // multiply the matrices
  private val resultingMatrix = matrixOne * matrixTwo

  // print the result
  println(resultingMatrix)

//  private val matrixOne = Array.ofDim[Int](2, 2)
//  matrixOne(0)(0) = 1
//  matrixOne(0)(1) = 2
//  matrixOne(1)(0) = 3
//  matrixOne(1)(1) = 4
//
//  private val matrixTwo = Array.ofDim[Int](2, 2)
//  matrixOne(0)(0) = 1
//  matrixOne(0)(1) = 2
//  matrixOne(1)(0) = 3
//  matrixOne(1)(1) = 4
//  Array.
//  if (matrixOne(1).length == matrixTwo(0).length) {
//    matrixTwo.transpose
//  }
//
//  matrixOne.foreach(row => println(row.foreach(elem => print(elem + " "))))
//  //  for (row <- matrixOne) {
//  //    for (elem <- row) {
//  //      print(elem + " ")
//  //    }
//  //    println()
//  //  }
}
