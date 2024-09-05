public class LinearSearch {
    /* 
    Problem Statement: Given an array, and an element num 
    the task is to find if num is present in the given array or not. 
    If present print the index of the element or print -1.

Examples:
Example 1:                                      Example 2:
Input: arr[]= 1 2 3 4 5, num = 3                Input: arr[]= 5 4 3 2 1, num = 5
Output: 2                                       Output: 0  
Explanation: 3 is present in the 2nd index      Explanation: 5 is present in the 0th index4
*/
public static int LinearSearch(int[] arr, int n, int element){
        
    for(int i=0;i<n;i++){
         if(arr[i] == element){
          // Return index, if the given element 
         // matches with any element of array.
        return i;
      }
    }
    // If the given number not found.
   return -1;
}
public static void main(String[] args) {
    
        // Let size of array be 5 and element 
        // to be searched for be 7.
        int n = 5;
        int element = 7;
	    int[] arr = {1,3,5,7,8};
       System.out.println(LinearSearch(arr,n,element));
}
}
