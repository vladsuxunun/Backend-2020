object Solution2 {

def getDecimalValue(head: ListNode): Int = {
        
        def rec(a: ListNode, b: String = ""): String = {
            if (a.next == null) b + a.x.toString
            else
                rec(a.next, b + a.x.toString)
        }
        
        Integer.parseInt(rec(head), 2)
    }


}