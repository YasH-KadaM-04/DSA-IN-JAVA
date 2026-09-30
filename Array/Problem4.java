package  Array;


//span Of Array

/* Optimal Way */
/*Span of Array  Means Difference of  Max Element of Array and min element of array */
public class Problem4 {

  public static void main(String[] args) {
      int arr[]={10,5,10,3,11,50};
    
int max=arr[0];
int min=arr[0];
for (int i=1;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
    if (arr[i]<min){
        min=arr[i];
    }




  }
  System.out.println("Span of array is:"+(max-min));

}
}