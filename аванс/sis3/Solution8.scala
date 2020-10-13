object Solution8 {

  def kidsWithCandies(candies: Array[Int], extraCandies: Int): Array[Boolean] = {
    val max = candies.reduce(_ max _)
    val res = Array.ofDim[Boolean](candies.length)

    for((myCandies, kid) <- candies.zipWithIndex)
      if(extraCandies + myCandies >= max) res(kid) = true
    res
  }


}