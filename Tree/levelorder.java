// level order traversal follows BFS property
/* output : 1      -> level 1
            2 3    -> level 2
            4 5 6  -> level 3
*/

public static void levelorder(Node root){
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while(!q.isEmpty()){
          Node currentNode = q.remove();    //current node = 0th index element of queue in ist pass and so on.
          if(currentNode == null){          // if at any point we encounter null in our queue.
          System.out.println();             // for new line at every null.
              if(q.isEmpty()){              // if null is encounter at the end of the queue we will break the loop here.
                  break;
              } else{
                  q.add(null);              // if not the last null then simply add another null.
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
