object Solution {
  def average(salary: Array[Int]): Double = salary
    .foldLeft((0, Int.MaxValue, Int.MinValue, 0)) {
      (memo, next) =>
        memo match {
          case (sum, min, max, count) =>
            (sum + next, math.min(next, min), math.max(next, max), count + 1)
        }
    } match {
    case (sum, min, max, count) => ((sum - min - max) / (count - 2).toDouble)
  }
}