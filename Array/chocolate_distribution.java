/*
Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. 
There are m students, the task is to distribute chocolate packets such that: 

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
Output: Minimum Difference is 2 
Explanation:
We have seven packets of chocolates and 
we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum 
difference between maximum and minimum packet 
sizes.
*/

import java.util.*;
public class chocolateDistribution {
    static int getMin(int[] arr, int m){
        Arrays.sort(arr);
        if(arr.length == 0 || m == 0){
            return 0;
        }
        
        if(arr.length < m){
            return -1;
        }
        
        
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-m; i++){
            if((arr[i + m - 1] - arr[i]) < min){
                min = arr[i+m-1] - arr[i];
            }
        }
        return min;
    }
        
    
    public static void main(String args[]) {
      int arr[] = {7, 3, 2, 4, 9, 12, 56};
      System.out.print(getMin(arr, 10));
    }
}
