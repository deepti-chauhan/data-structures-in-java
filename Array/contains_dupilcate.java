/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true
*/

public boolean containDuplicate(int[] arr)
  {                                                                       //return true or false.
      HashSet<Integer> map = new HashSet<>();
      for(int i=0; i<arr.length; i++)
      {
        if(map.contains(arr[i]))
        {
          return true;
        }
        
        map.add(arr[i]);
      }
  
  return false;
}
  
