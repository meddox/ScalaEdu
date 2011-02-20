package com.meddoxdev.edu

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hi my lovely World!" )
    println("concat arguments = " + foo(args))
  }

}
