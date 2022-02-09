public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        
        int leftsubtree = countNodes(root.left);
        int rightsubtree = countNodes(root.right);
        
        return leftsubtree + rightsubtree + 1;
    }
