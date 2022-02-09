
// Time Complexity : O(N)
public static int heightOfTree(Node root){
  if(root == null){
    return 0;
  }
  
  int leftHeight = heightOfTree(root.left);
  int rightHeight = heightOfTree(root.right);
  
  int treeHeight = Math.max(leftHeight, rightHeight) + 1;
  return treeHeight;
}
