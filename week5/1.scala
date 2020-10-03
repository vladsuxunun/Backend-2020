object Solution {
  var sum=0
  def rangeSumBST(root: TreeNode, L: Int, R: Int): Int = {
    if (root.value!=null){
      if((root.value<=R)&(root.value>=L)){sum+=root.value}
      if(root.left!=null){rangeSumBST(root.left,L,R)}
      if(root.right!=null){rangeSumBST(root.right,L,R)}
    }
    sum
  }
}