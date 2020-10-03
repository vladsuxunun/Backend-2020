object Solution{
    def longestUnivaluePath(root: TreeNode): Int = {
        var maxUnivaluePath = 0
 
        def longestUnivaluePathStartAt(root: TreeNode): Int = {

            if (root == null) {
                return 0
            }
        
            var leftLength = longestUnivaluePathStartAt(root.left)
            var rightLength = longestUnivaluePathStartAt(root.right)
        
            if (root.left != null && root.value == root.left.value) {
                leftLength += 1
            } else {
                leftLength = 0
            }
        
            if (root.right != null && root.value == root.right.value) {
                rightLength += 1
            } else {
                rightLength = 0
            }

            maxUnivaluePath = Math.max(maxUnivaluePath, leftLength + rightLength)
        
            return Math.max(leftLength, rightLength)
        }
        
        longestUnivaluePathStartAt(root)
        maxUnivaluePath 
    }
}