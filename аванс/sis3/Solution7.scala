object Solution7 {

 def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
      
      val Weak = Array.ofDim[Int](mat.size)
      
      var row = 0
      
      while (row < mat.size) {
        if (mat(row)(Weak(row)) == 1) Weak(row) += 1
        
        // 1st Range check to avoid array Index during matrix value check
        if (Weak(row) == mat(0).size || mat(row)(Weak(row)) == 0) row += 1
      }
      
      Weak.zipWithIndex.sortBy(c => c._1).take(k).unzip._2
    }


}