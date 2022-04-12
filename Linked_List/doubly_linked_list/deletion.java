// delete Node in doubly linked list
/*
  -> delete the head
  -> delete the end
  -> delete the middle
  
  TC = O(1)  SC = O(1)
*/

public void deleteNode(Node currNode){
  
  //base case
  if(currNode == null) {  System.out.print("Can't delete from an empty list"); }
  
  //head case
  /*
    1->-2->3->4->null  we delete the head ( which is pointing to Node 1 ), 
    now the head pointer will point to the next node from the current node(i.e 1)
    next of 1 is 2.
  */
  
  if(currNode == head) {  head = currNode.next;  } 
  
  /*----------------------------deletion somewhere in the middle of linked list.----------------------------*/
  
  /* if the node deleted is not the last Node
     the change the next pointer values.
  */
  if(currNode.next != null) {  currNode.next.prev = currNode.prev;  }
  
  /* if the node deleted is not the first Node
     the change the prev pointer values.
  */
  if(currNode.prev != null) {  currNode.prev.next = currNode.next;  }
  
}  
    
