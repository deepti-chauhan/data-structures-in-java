//print postorder leftSubtree -> rightSubtree -> root
        public static void postorder(Node root){
            if (root == null){
                return;
            }
            
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
