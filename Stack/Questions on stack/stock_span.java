/*
  input array  : [100, 80, 60, 70, 60, 75, 85]
  output array : [1,   1,  1,  2,  1,  4,  6 ]  
*/

public ArrayList<Integer> stockSpan(ArrayList<Integer> A) 
{
  Stack<Pair<Integer, Integer>> s = new Stack<>();
  ArrayList<Integer> arr = new ArrayList<>();
  while( s.size() != 0 && s.peek().getKey() <= A.get(i) )
  {
    s.pop();
  }
  
  if(s.size() == 0)
  {
    arr.add(-1);
  }
  
  else
  {
    arr.add(s.peek().getValue());
  }
  
  Pair p = {A.get(i), arr.get(i)};
  s.push(p);
  
  
}
    
