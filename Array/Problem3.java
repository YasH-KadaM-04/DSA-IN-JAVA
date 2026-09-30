package Array;
// Second Largest

/*BruteForce Approach : sort the array  largest is n-1 where n is the size 
						of Array  and second largest is checked  by traversing from second last  Like if(arr[n-2]!=arr[n-1] then
						second Largest is ar[n-2] else( check for arr[n-3])

*/
//import java.util.*;

// public class SecondLargest02 {
//     public static void main(String[] args) {

//         int[] arr = {10, 5, 8, 10, 3};

//         Arrays.sort(arr);

//         int n = arr.length;
//         int largest = arr[n - 1];
//         int secondLargest = -1;

//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] != largest) {
//                 secondLargest = arr[i];
//                 break;
//             }
//         }

//         System.out.println("Second Largest: " + secondLargest);
//     }
// }
/* Better Approach: 
find the Largest element then below it agian  traverse initally store arr[0] as second
largest  then check if(arr[i]<largest && arr[i]!=largest) then Second largest=arr[0]and keep Traverse unitl 
we get Second Largest



// */


// public class SecondLargest02  {
//     public static void main(String[] args) {

//         int[] arr = {10, 5, 8, 10, 3};

//         int largest = arr[0];
//         int secondLargest = -1;

//         // Find largest
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }

//         // Find second largest
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }

//         System.out.println("Second Largest: " + secondLargest);
//     }
// }




/*Optimal Way: */
public class Problem3 {
    
	public static void main(String[] args){
	    
	    int arr[]={10,5,10,3,11,50};
	    int FL=arr[0];
	    int SL=arr[1];
	    
	    for (int i=1; i<arr.length;i++){
	        if(arr[i]>=FL){
	         
	         int temp=FL;
	       FL=arr[i];
	       SL=temp;
	        }
	        else if(arr[i]>SL){
	            SL=arr[i];
	        }
	    }
		System.out.println( "FL is:"+FL+" SL is:"+SL);
	    
	    
	
}
}
