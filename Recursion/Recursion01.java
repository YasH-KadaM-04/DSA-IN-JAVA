/* Recursion : A function that called itself is called as Recursion until it reached
                to specific Condition
Infinte Recursion: Funtion which Has not Specified condition and it keep calling itself
                    and finally reached to stack overflow condition
*/  


// public class Recursion1 {


// public static void Infinite(){
//     System.out.println("*");
//     Infinite();
//   } 

//     public static void main(String[] args) {
    

//     Infinite();
// }
  
// }


/*  Finite Recursion : Recursion which has some specified Condition to stop recursion 
             that condition is known as base condition 


*/
public class Recursion01 {

public static void finite(int Count){
    if (Count==5){//Base Condition when Count reaches to 5 it return
        return;  
    }

    System.out.println('*');
    Count++;
    finite( Count);
  }  
    public static void main(String[] args) {
    int Count=0;

    finite( Count);
}
  
}