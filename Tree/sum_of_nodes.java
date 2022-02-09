public static int sumOfNodes(Node root){
  if( root == null){
    return 0;
  }
  
  int leftsubTree = sumOfNodes(root.left);
  int rightsubTree = sumOfNodes(root.right);
  
  return leftsubTree + rightsubTree + node.data;
}

// return the sum of nodes in a binary tree using recursion.
