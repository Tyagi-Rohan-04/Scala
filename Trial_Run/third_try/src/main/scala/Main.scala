// Write a Scala program that takes three integers as input and prints the maximum of the three. (Using functions)

@main def run(): Unit = {
  println(maxOfThree(10, 5, 8))
}

def maxOfThree(a: Int, b: Int, c: Int): Int = {
  if (a >= b && a >= c) a
  else if (b >= a && b >= c) b
  else c
}