//print inorder leftSubtree -> root -> rightSubtree
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
