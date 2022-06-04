/*
  Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
  A subarray is a contiguous part of an array.
  
  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  Output: 6
  Explanation: [4,-1,2,1] has the largest sum = 6.
*/


public int maxSub(int[] arr)
{
  int currSum = 0;
  int maxSum = Integer.MIN_VALUE;
  int n = arr.length;
  
  for(int i = 0; i < n; i++)
  {
    currSum += arr[i];
    if(currSum > maxSum){ maxSum = currSum; }
    if(currSum < 0) { currSum = 0;  }
  }
  return maxSum;
} 
