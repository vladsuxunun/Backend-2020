object Solution4 {

 def repeatedNTimes(A: Array[Int]): Int = {
        ((A foldLeft (Set[Int](), false, 1)) {
            case ((elements, foundAns, ans), elem) =>
                if (foundAns)
                    (elements, foundAns, ans)
                else {
                    if (elements contains elem) {
                        (elements, true, elem)
                    } else {
                        (elements + elem, foundAns, ans)
                    }
                }
        })._3
    }


}