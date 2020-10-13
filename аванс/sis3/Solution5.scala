import scala.collection.mutable.ArrayBuffer
object Solution5 {

def decompressRLElist(a: Array[Int]): Array[Int] = {
        var res = ArrayBuffer[Int]()
        for(i <- 0 until a.length by 2){
            res ++= ArrayBuffer.fill(a(i))(a(i+1))
        }
        res.toArray
    }

}