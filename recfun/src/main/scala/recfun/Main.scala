package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(r == 0 && c == 0) return 1
      if(c < 0 || c > r) return 0
      else return pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def is_blanced(chars: List[Char], open: Int): Boolean = {
        if(chars.isEmpty == true)
          if (open == 0) return true else return false
        else {
          if(chars.head == '(') {
            return is_blanced(chars.tail, open + 1)
          }
          if(chars.head == ')') {
            return if (open == 0) false else is_blanced(chars.tail, open - 1)
          }
          return is_blanced(chars.tail, open)
        }
      }
      is_blanced(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money < 0 || coins.length == 0) return 0
      if (money == 0) return 1
      else return countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
