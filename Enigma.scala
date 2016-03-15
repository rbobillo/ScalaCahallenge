trait CarbonIT {
  val trueLove: (Int,Int) => Int = _ ^ _
  val decipher: String => String = enigma => {
    ???
  }
}

class Help extends CarbonIT {
  val hook   = "You love Scala ?" :: "Make a living of it !" :: Nil
  val enigma = "49 42 53 98 45 42 108 112 29 18 6 44 45 37"
}

class GetAnAwesomeJob extends Help {
  def get[S <: String](x:S)(f:S => S) = f(x)
  def now = (hook :+ get(enigma)(decipher)) foreach println
}

object ScalaLover {// "SCALA" is the always key to your problems
  def beHappy = new GetAnAwesomeJob with CarbonIT
  def main(av:Array[String]): Unit = beHappy.now
}
