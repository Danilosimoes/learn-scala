package br.com.mystudies.from.scala


class Vehicle {
  protected def checkEngine = {}
}


class Car extends Vehicle {
  def start = checkEngine
  def tow(car: Car) = car checkEngine
  //def tow(vehicle: Vehicle) = vehicle checkEngine  -> don't compile
}


class GasStation {
  //def fillGas(vehicle: Vehicle) = vehicle checkEngine don't compile
}


// Scala is a lot more stringent about access to protected members