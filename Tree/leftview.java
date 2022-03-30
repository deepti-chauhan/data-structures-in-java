public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      
      public void leftview(TreeNode root, ArrayList list, int level){
          if(root == null) return;
          if(list.get(level) == null){
              list.add(root);
          }
          
          leftview(root.left, list, level+1);
          leftview(root.right, list, level+1);
      }
      
      public void printleftview(TreeNode root){
          ArrayList<TreeNode> list = new ArrayList<>();
          
          leftview(root, list ,0);
          for(TreeNode curr : list){
              System.out.print(curr.val + " ");
          }
      }
}
