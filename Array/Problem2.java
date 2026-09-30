/* optimal Way*/
 package Array;
//Largest element

public class Problem2 {
 
	public static void main(String[] args){
	    
	    int arr[]={10,5,10,3,11,50};
	    int FL=arr[0];
	
	    
	    for (int i=1; i<arr.length;i++){
	        if(arr[i]>=FL){
	         
	      
	       FL=arr[i];
	    
	        }
        }
		System.out.println( "FL is:"+FL);
	    
	    
	
}
}



/* Brute Approach:

Sort the Array Then n-1 element is the Largest one

*/
// import java.util.*;
// public class FirstLargest01{
//     public static void main(String[] args) {
//         Integer arr[]={10,5,10,3,11,50};
// List<Integer> list = Arrays.asList(arr);// creating new list
//   Collections.sort(list); // using sorting function
//         System.out.println(list);
// int n=list.size();// Calculating size of list
// System.out.println(list.get(n));// Printing Largest Element
      

       
//     }
// }








 