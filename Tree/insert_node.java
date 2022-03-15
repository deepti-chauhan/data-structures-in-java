/*-----insert new node into BST------*/
/*----using recursion----*/
public Node insertNode(Node root, int val){
  //base case
  if( root  ==  null ){
      root = new Node(val);                     //if tree is empty creata new node with the given value.
  }                                            //check for right and left subtree
  if( val < root.val ) {
    root.left = insertNode(root.left, val);  //if value is less than the root value so goes into the left subtree else in the rigt subtree.
  }   else{
    root.right = insertNode(root.right, val); }
  
  return root;  //final output.
  
