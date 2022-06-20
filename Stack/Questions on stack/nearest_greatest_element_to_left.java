public static long[] NGL(long[] arr, int n)         // input array and size of array 
{
  long[] output_array = new long[n];                // output array
  Stack<Long> s = new Stack<>();                    // auxiliary stack.
  
  
  for(int i=0; i<n; i++)                            // traverse from the starting of array and start pushing elements in stack
  {
    while( s.size() != 0 && s.peek() <= arr[i])     // if stack is not empty and top element of stack is not greater than the current element 
    {                                               // pop it out of stack.
      s.pop();
    }
    
    if( s.size() == 0 )                             // if stack is initially empty || stack becomes empty while popping all the elements
    { 
       output_array[i] = -1;                        // return -1 in output array.
    }
    
    else                                            // while popping if we get some element greater than our current element 
    {
      output_array[i] = s.peek();                   // add it to the output array.
    }
    
    
    s.push(arr[i]);                                 // otherwise push elements in the stack.
  }
  
    return output_array;                            // return the result.
}  
