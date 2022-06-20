public static long[] NGL( long[] arr, int n )           // n is size of given array.
{
  long[] output_array = new long[n];                    // output array equals to length of input array.
  
  Stack<Long> s = new Stack<>();                        // intialize stack for all the operations.
  
  for(int i=n-1; i>=0; i--)
  {
    while( s.size() != 0 && s.peek() <= arr[i])
      {
        s.pop();
      }
    
    if(s.size() == 0)
      {
        output_array[i] = -1;
      }
    else
      {
        output_array[i] = s.peek();
      }
    
    
    s.push(arr[i]);
  }
  
  return output_array;
}
