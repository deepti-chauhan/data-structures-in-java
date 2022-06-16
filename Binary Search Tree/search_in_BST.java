    /*---------------search in BST----------------*/
    public static  boolean search(Node root, int key){

        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        else if(key < root.data){
            return search(root.left, key);
        }

        else {
            return search(root.right, key);
        }
    }
