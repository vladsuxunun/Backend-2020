object Main extends {
  def sumZero(n: Int): Array[Int] = { // 6th task
    //var n:Array = n
    val ans: Array[Int] = new Array(n)
    var rr = 0
    var i = 0
    for(i  <- 0 to n){
      ans(i) = i
      rr += i
    }

    ans(i) = -rr

    return ans




  }


  def nineth(otherfunction : CustomFunction,n:Int): List[List[Int]] = { // 8th task
  var s = List[List[Int]]()
    var i = 1
    for (i <- 1 to 1000; j <- 1 until 100){
      if(otherfunction.f(i,j) == n)
          s = s : + List(i,j)

    }
    return s


  }
  def intersection(nums1: Array[Int],nums2:Array[Int]):Array[Int] = { /// 9th task
    var arr = Array[Int]()
    for(i <- 0 until nums1.size) {
      {
        for (j <- 0 until nums2.size ){
          if (nums1(i) == nums2(j)){
            arr = arr : + nums2(j)
          }
        }
      }
    }
    return arr.distinct
  }


}

