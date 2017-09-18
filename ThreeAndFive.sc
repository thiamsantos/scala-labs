def add(x: Int, y: Int): Int = x + y
val numbers = for (number <- 0 until 1000 if (number % 3 == 0 || number % 5 == 0)) yield number
println(numbers.reduceLeft(add))
