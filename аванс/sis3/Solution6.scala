object Solution6 {

def sumZero(n: Int): Array[Int] = {
        val nums = (1 to (n/2)).to(LazyList).flatMap(x => LazyList(x, -x))
		(if (n % 2 == 0) nums else nums :+ 0).toArray
    }


}