object FilterPrime extends App {
  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else if (num == 2) true
    else !(2 to Math.sqrt(num).toInt).exists(x => num % x == 0)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val outputList = filterPrime(inputList)
  println(outputList) // Output: List(2, 3, 5, 7)
}

