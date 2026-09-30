/* sum of N Natural Number Using Recursion 
This is Parameterized way to do it 
*/
// public class Problem4 {
//     public static void Sum(int i,int Result){
//             if (i<1){
//                 System.out.println("The Sum is:"+Result);
//                 return;
//             }
//             Sum(i-1,Result+i);
//     }
//     public static void main(String[] args) {
//       int n=4;
    

//       Sum(n,0);
//     }
// }


/*Using Composite Function */

public class Problem4{
    public static int Sum(int n){
        if(n==0){
    return 0;
        }
        return  n+Sum(n-1);
    }
    public static void main(String[] args) {
        

     int n=4;
       
       
       System.out.println(Sum(n));
    }
}