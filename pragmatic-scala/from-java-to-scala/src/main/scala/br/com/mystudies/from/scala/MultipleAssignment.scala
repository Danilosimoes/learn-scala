package br.com.mystudies.from.scala

object MultipleAssignment extends App {


  def getPersonInfo(key: Int) = {
    ("Robson", "Duarte", "robson.o.d@gmail.com")
  }



  val (firstName, lastName, email) = getPersonInfo(1)


  println(s"First Name: $firstName")
  println(s"Last Name: $lastName")
  println(s"Email : $email")



  // the compile error because the number of vals is less and fewer than return of getPersonInfo()
  //val (x, y) = getPersonInfo(1)
  //val (z,y,x,k) = getPersonInfo(1)

  val info = getPersonInfo(1)

  println(info._1)
  println(info._2)
  println(info._3)
}
