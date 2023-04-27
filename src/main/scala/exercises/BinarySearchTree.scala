//package com.knoldus
//
//import scala.annotation.tailrec
//
//case class Node(data: Int,var leftNode: Node = null,var rightNode: Node = null)
//class BinarySearchTree {
//  private var rootNode: Node = null
//
//  def addNode(data: Int): Node = {
//    rootNode = insertNode(rootNode, data)
//    rootNode
//  }
//
//  private def insertNode(currentNode: Node, data: Int): Node = {
//    if (currentNode == null) Node(data)
//    else if (data < currentNode.data) {
//      // println("left data inserted")
//      currentNode.leftNode = insertNode(currentNode.leftNode, data)
//      currentNode
//    }
//    else {
//      //println("right data inserted")
//      currentNode.rightNode = insertNode(currentNode.rightNode, data)
//      currentNode
//    }
//  }
//
//  def search(data: Int): String = {
//    @tailrec
//    def searchHelper(currentNode: Node): String = {
//      if (currentNode == null) "Binary search tree is empty"
//      else if (currentNode.data == data) s"$data is found"
//      else if (currentNode.data != data && currentNode.leftNode == null && currentNode.rightNode == null) s"$data not found"
//      else if (data < currentNode.data) searchHelper(currentNode.leftNode)
//      else searchHelper(currentNode.rightNode)
//    }
//
//    searchHelper(rootNode)    val minNode = findMinNode(currentNode.rightNode)
//              // currentNode.data = minNode.data
//              currentNode.rightNode = deleteHelper(currentNode.rightNode, minNode.data)
//              currentNode
//
//              //          val newLeftNode = currentNode.leftNode
//              //          val newRightNode = deleteHelper(currentNode.rightNode)
//              //          val newNode = Node(minNode.data, newLeftNode, newRightNode)
//              //          newNode
//            }
//          }
//
//
//        case (data < currentNode.data) =>
//          currentNode.leftNode = deleteHelper(currentNode.leftNode, value)
//          currentNode
//
//        case (data > currentNode.data) =>
//          currentNode.rightNode = deleteHelper(currentNode.rightNode, value)
//          currentNode
//
//        case _ => null
//      }
//      deleteHelper(rootNode, data)
//      rootNode = deleteHelper(rootNode, value)
//      rootNode
//    }
//  }
//
//    def findMinNode(node: Node): Node = {
//      var current = node
//      while (current.leftNode != null) {
//        current = current.leftNode
//      }
//      current
//    }
//
//    def traversal(): Unit = {
//      def traversalHelper(currentNode: Node): Unit = {
//        if (currentNode != null)
//          traversalHelper(currentNode.leftNode)
//        println(currentNode.data)
//        traversalHelper(currentNode.rightNode)
//
//      }
//
//      traversalHelper(rootNode)
//    }
//}