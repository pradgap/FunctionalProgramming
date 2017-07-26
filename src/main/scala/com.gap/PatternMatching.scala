package com.gap


object PatternMatching extends App{

  def findContinent(c: Country): String = c match{
    case Nepal() => "Asia"
    case France() => "Europe"
  }

  println(findContinent(new Nepal()))
  println(findContinent(new France())

}

class Country {
  var continentName= new String()
}

case class Nepal() extends Country{
  continentName="Asia"
}

case class France() extends Country{
  continentName="Europe"
}
