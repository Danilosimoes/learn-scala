package br.com.mystudies.scala

object IteratingOverMaps extends App {


  val scores = Map("Bob" -> 10, "Cindy" -> 7, "Fred" -> 8)


  // access key/value
  for((k,v) <- scores)
    print((k,v))



  // only values
  for( v <- scores.values)
    print(v)



    
    
    
}