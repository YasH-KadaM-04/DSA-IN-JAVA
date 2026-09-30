

/*Parameterised Way to Print Factorial */

// public class Problem5 {
//  public static void Fact(int i,int n , int  fact){

//     if(i>n){
//     System.out.println(fact);
//     return;

//     }

//     Fact(i+1,n,fact=fact*i);
//  }  
//     public static void main(String[] args) {
      
//         Fact(1,5,1);
//     }
// }


/* ComPosite Way to Print Fact */
public class Problem5{

    public static int Fact(int n){
       
        if (n<1){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
     
        System.out.println("THer Factorial is: "+Fact(5));
    }
}