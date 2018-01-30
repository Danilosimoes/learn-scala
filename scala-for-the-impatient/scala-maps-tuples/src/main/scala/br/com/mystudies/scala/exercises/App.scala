package br.com.mystudies.scala.exercises
import scala.collection.mutable.Map
import scala.io.Source
import scala.collection.mutable.HashMap
import scala.collection.immutable.TreeMap
import scala.collection.mutable.LinkedHashMap
import scala.sys.SystemProperties



object App {


  def getWeekDay(day: Int) = {
    val weekdays = LinkedHashMap( 1 -> "Monday", 2 -> "Tuesday", 3 -> "Wednesday", 4 -> "Thursday",  5 -> "Friday", 6 -> "Sartuday", 7 -> "Sunday" )
    weekdays(day)
  }


  def printSystemProperties(){
	 for((k,v) <- new SystemProperties().toMap){
	   println(k + " | " + v )
	 }
  }


  def minMax(values: Array[Int]) = {
    Map("Max" -> values.max, "Min" -> values.min )
  }



  def lteggt(values: Array[Int], v:Int) = {
    var lt = 0
    var eg = 0
    var gt = 0

    for(x <- values){

      if (x > v) {
       gt =  gt + 1
      }
      if (x < v) {
       lt = lt + 1
      }
      if (x == v) {
       eg = eg + 1
      }
    }

    (lt, eg, gt)

  }





  def main(args : Array[String]) {




      println(getWeekDay(1))
      println(getWeekDay(2))
      printSystemProperties
      println(minMax(Array(2, 1, 4, -10, 3, 5, 8, 100)))
  	  println(lteggt(Array(2, 1, 4, -10, 3, 5, 20, 6 , -15, -8, 8, 100),5))

  	   for(x <- "Hello".zip("World")){
  	     print(x)
  	   }

  	  println("Hello".zip("World").toMap)

  }


}

