/*
  input   :  1 <-> 2 <-> 3 <-> 4 -> null
  reverse :  4 <-> 3 <-> 2 <-> 1 -> null 
*/

public void reverse(){
  
  //base case
  if(head == null || head.next == null){ return }
  
  Node temp = null;                 
  Node curr = head;                 
  
  while(curr != null){
    temp = curr.prev;                
    curr.prev = curr.next;
    curr.next = temp.
    curr = curr.prev;
  }
  
  if(temp != null){  head = temp.prev;  }
}
