/*Reversing Array Using Recursion Two pointer */
// public class Problem6 {

    
//     public static void Reverse(int L, int R,int[] arr){
//         if(L>= R){
//             return;
//         }
//         //Swap
//         int Temp=0;
//         Temp=arr[L];
//         arr[L]=arr[R];
//         arr[R]=Temp;
//         Reverse(L+1,R-1,arr);
        
        
//     }
    
// public static void Display(int[] arr){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// 	public static void main(String[] args) {
// 		int arr[]={1,4,2,3,5};
// 		   System.out.println("Original Array: ");
// 		Display(arr);
	
// 		Reverse(0,4,arr);
// 		   System.out.print("Reversed Array: ");
// 		Display(arr);
	
	    
// 	}
// }

/*Reversing Array Using Recursion Single pointer */

/*Reversing Array Using Recursion Two pointer */
public class Problem6 {

    
    public static void Reverse(int i,int n,int[] arr){
        if(i>= n-i-1){
            return;
        }
        //Swap
        int Temp=0;
        Temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=Temp;
        Reverse(i+1,n,arr);
        
        
    }
    
public static void Display(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
	public static void main(String[] args) {
		int arr[]={1,4,2,3,5};


		   System.out.println("Original Array: ");
		Display(arr);
	
//n is the number of element in Array
        
		Reverse(0,5,arr);





		   System.out.print("Reversed Array: ");
		Display(arr);
	
	    
	}
}