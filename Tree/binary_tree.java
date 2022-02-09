import java.util.*;
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
        
        public static void levelorder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while(!q.isEmpty()){
                Node currentNode = q.remove();   //current node = 0th index element of queue in ist pass and so on.
                if(currentNode == null){        // if at any point we encounter null in our queue.
                System.out.println();  // for new line at every null.
                    if(q.isEmpty()){            // if null is encounter at the end of the queue we will break the loop here.
                        break;
                    } else{
                        q.add(null);            // if not the last null then simply add another null.
                    }
                } 
                else{
                    // if current node is not null then just add its right and left children in the queue.
                    System.out.print(currentNode.data + " ");
                    if(currentNode.left != null){
                        q.add(currentNode.left);
                    }
                    if(currentNode.right != null){
                        q.add(currentNode.right);
                    }
                }
            }
            
        }
    }
    
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        
        int leftsubtree = countNodes(root.left);
        int rightsubtree = countNodes(root.right);
        
        return leftsubtree + rightsubtree + 1;
    }
    
    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsubtree = sumNodes(root.left);
        int rightsubtree = sumNodes(root.right);
        
        return leftsubtree + rightsubtree + root.data; 
    }
    
    
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        
        
        int treeHeight = Math.max(leftHeight, rightHeight) + 1;
        
        return treeHeight;
    }
    
    
    public static void main(String args[]) {
      int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      
      BinaryTree b = new BinaryTree();
      Node root = b.buildtree(nodes);
      
      System.out.print(countNodes(root));
        
      System.out.print(heightOfTree(root));
        
      System.out.print(sumNodes(root));
        
      b.preorder(root);
      System.out.println();
        
      b.inorder(root);
      System.out.println();
        
      b.postorder(root);
        
      b.levelorder(root);
    }
}

// 1 2 4 5 3 6  -> preorder
// 4 2 5 1 3 6  -> inorder
// 4 5 2 6 3 1  -> postorder
