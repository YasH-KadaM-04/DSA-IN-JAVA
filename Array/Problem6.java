// public class Main {
    
//     public static int Max(int arr[],int max){
//         	 for(int i=1; i<arr.length;i++){
// 	     if(arr[i]>max){
// 	       max=arr[i];
// 	     }
	     
// 	 }
// 	         return max;
//     }
// 	public static void main(String[] args) {
	    
// 	    int arr[]={2,5,4,1,3};
// 	int max=arr[0];
//  int result=Max(arr,max);




// for(int j=max; j>=1;j--){
//     for(int i=0; i<arr.length; i++){
//         if(arr[i]>=max){
//               System.out.print("*\t");
//         }
//         else{
//             System.out.println("\t");
//         }
//     }


//   System.out.println();
// }
	 
// 	}
// }





// Here we have given array elements according to that we have to print the

// Star and for rest we have to print space 


public class Problem6 {

    public static int Max(int arr[], int max) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 4, 1, 3};
        int max = arr[0];

        int result = Max(arr, max);

        for (int i = result; i >= 1; i--) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }

            System.out.println();
        }
    }
}













