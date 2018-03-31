import scala.math.abs

object SquareRoot extends App {
  def sqrt(x: Double): Double = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) < 0.001

    sqrtIter(1.0)
  }

  println(s"${sqrt(25)}")
  println(s"${sqrt(9)}")
}
