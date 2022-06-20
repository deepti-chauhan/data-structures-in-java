public ArrayList<Integer> NSL(ArrayList<Integer> A, int n){
  
  ArrayList<Integer> op = new ArrayList<>();
  Stack<Integer> s = new Stack<>();
  
  for(int i=0; i<n; i++){
    while( A.size() != 0 && s.peek() >= A.get(i)){
      s.pop();
    }
    
    if(s.size() == 0){
      op.add(-1);
    }
    else{
      op.add(s.peek());
    }
    
    s.push(A.get(i));
  }
  
  return op;
}
