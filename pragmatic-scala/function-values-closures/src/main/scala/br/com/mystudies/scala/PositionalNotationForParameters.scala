package br.com.mystudies.scala

object PositionalNotationForParameters extends App {

  val arr = Array(1,2,3,4,5)

  val total1 = (0 /: arr){(x,y) => x + y}
  val total2 = (0 /: arr){_+_}

  val negativeNumberExists1 = arr exists {x => x < 0}
  val negativeNumberExists2 = arr exists {_ < 0}

}