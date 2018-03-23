def product(f:Int => Int)(a: Int, b: Int) : Int =
  if(a > b) 1 else f(a) * product(f)(a + 1, b)

def cubes(x: Int): Int = x * x * x


product(cubes)(1, 3)

def fact(n: Int): Int = product(x => x)(1, n)

fact(5)









