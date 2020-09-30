object Solution {
def findPairs(nums: Array[Int], k: Int): Int = {
    var seenSet = new HashSet[Int]()
    var pairsSet = new HashSet[(Int,Int)]()
    for(num <- nums){
      if(seenSet.contains(num + k)){
        if(!pairsSet.contains(num, num + k))
          pairsSet += ((num + k, num))
      }
      if(seenSet.contains(num-k)){
        if(!pairsSet.contains(num, num - k))
          pairsSet += ((num - k,num))
      }
      seenSet += num
    }
    println(pairsSet)
    pairsSet.size
  }
}