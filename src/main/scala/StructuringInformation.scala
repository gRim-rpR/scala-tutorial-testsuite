object StructuringInformation extends App {

  sealed trait Symbol

  case class Note(name: String, duration: String, octave: Int) extends Symbol

  case class Rest(duration: String) extends Symbol

  def symbolDuration(symbol: Symbol): String =
    symbol match {
      case Note(name, duration, octave) => duration
      case Rest(duration) => duration
    }

  def unexhaustive(): Unit = {
    def nonExhaustiveDuration(symbol: Symbol): String =
      symbol match {
        case Rest(duration) => duration
      }
  }

  sealed trait Duration

  case object Whole extends Duration

  case object Half extends Duration

  case object Quarter extends Duration

  def fractionOfWhole(duration: Duration): Double =
    duration match {
      case Whole => 1.0
      case Half => 0.5
      case Quarter => 0.25
    }

  //  fractionOfWhole(Half) shouldBe 0.5
  //  fractionOfWhole(Quarter) shouldBe 0.25
}
