import org.scalatest.FunSuite

class RecursionTest extends FunSuite {
  test("Recursion.gcd") {
    assert(Recursion.gcd(14,21) === 7)
  }
  test("Recursion.factorial") {
    assert(Recursion.factorial(4) === 24)
  }
}
