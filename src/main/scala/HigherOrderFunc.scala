object HigherOrderFunc extends App {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)

  def cube(x: Int): Int = x * x * x

  def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)

  def sumFactorials(a: Int, b: Int): Int =
    if (a > b) 0 else factorial(a) + sumFactorials(a + 1, b)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def id(x: Int): Int = x

  def sumIntsHigherOrder(a: Int, b: Int): Int = sum(id, a, b)

  def sumCubesHigherOrder(a: Int, b: Int): Int = sum(cube, a, b)

  def sumFactorialsHigherOrder(a: Int, b: Int): Int = sum(factorial, a, b)

  def sumIntsAnonymous(a: Int, b: Int): Int = sum(x => x, a, b)

  def sumCubesAnonymous(a: Int, b: Int): Int = sum(x => x * x * x, a, b)

  def sumTailRec(f: Int => Int, a: Int, b: Int): Int = {
    def loop(x: Int, acc: Int): Int = {
      if (x > b) acc
      else loop(x + 1, acc + f(x))
    }

    loop(a, 0)
  }

  //  sumTailRec(x => x, 1, 10) shouldBe 55
}
