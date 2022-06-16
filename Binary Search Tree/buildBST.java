public class BST {

    static class Node {
        int data;
                                                                        //left and right will be null by default.
        Node left;
        Node right;
                                                                        //constructor of Node class
        Node(int data) {
            this.data = data;
        }
    }

    public static Node buildBST(Node root, int val){

            if(root == null){
                Node newNode = new Node(val);
                return newNode;
            }

            if(val < root.data){
                root.left = buildBST(root.left, val);                   //jump into left subtree.
            }
            else{
                root.right = buildBST(root.right, val);                 //jump into right subtree.
            }

            return root;
    }

    public static void inorder(Node root){                              //to check if the tree built is correct.
        if(root == null){                                               // inorder of BST gives a sorted sequence.
            return;
        }

        inorder(root.left);
        System.out.print(root.data + "-");
        inorder(root.right);

    }


    public static void main(String[] args){
        int[] values = {3,5,1,7,2,4,6};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = buildBST(root, values[i]);
        }

        inorder(root);
        System.out.println();
    }
}
