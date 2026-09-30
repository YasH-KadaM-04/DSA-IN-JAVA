package BasicJavaQuestions.NumberConversions;


// progrm  To Checjked Single number is prime or not ??


// import java.util.Scanner;

// public  class Main{


//     public static void main(String[] args) {
// Scanner sc= new Scanner (System.in); 
// System.out.print("Enter How many numbers do you Want to Check:");
// int m= sc.nextInt();
// for ( int i=0; i<m; i++){

// int count=0;
// System.out.println("Enter The Number Do want to check whether Prime or Not:" );

//     int n=sc.nextInt();
//     for (int j=2; j<n;j++){

//         if (n%j==0){
//             count++;
// break;
//         }
        
//     }
//     if(count==0){
//         System.out.println("prime");
//     }
//     else
//     {
//         System.out.println("Not Prime");
//     }




// }

 

// sc.close();
// }

//     }

/// Program to print  consecutive  prime number 
import java.util.Scanner;
public class PrimeCheck3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Upto Which Number you have to check Number is prime or not :");
        int n = sc.nextInt();

         for (int i = 2; i <= n; i++) {// start from 2 because 1 is nither prime 
            int count = 0;
            for (int j = 2; j < i; j++) { // this main starting from two beacuse every number is divisible by 1 also less than i
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) { // this so important i.e not less than 2 because  for 4 and 9 we found on divsor so condition fail                use count==0 i number not include i.e j<i
                System.out.println(i +"  is  prime ");
            }
            else{
                System.out.println(i +"  is  Not prime ");
            }
 
 
        }
sc.close();

    }
}