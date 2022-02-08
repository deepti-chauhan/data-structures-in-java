public class BinaryTreeClass {
    
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree{
        static int idx = -1;
        
        
        // build tree using preorder.
        public static Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            
            return newNode; //returns the root node.
        }
        
        //print preorder  root-> left subtree -> right subtree
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        
        //print inorder leftSubtree -> root -> rightSubtree
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        
        //print postorder leftSubtree -> rightSubtree -> root
        public static void postorder(Node root){
            if (root == null){
                return;
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    
    
    public static void main(String args[]) {
      int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      
      BinaryTree b = new BinaryTree();
      Node root = b.buildtree(nodes);
      
      
      b.preorder(root);
      System.out.println();
      b.inorder(root);
      System.out.println();
      b.postorder(root);
    }
}

// 1 2 4 5 3 6  -> preorder
// 4 2 5 1 3 6  -> inorder
// 4 5 2 6 3 1  -> postorder
