
/*Print Name 5 times */


public class Problem1 {

public static void finite(int Count){
   
    if (Count==5){
        return;  
    }

    System.out.println(" My name is Yash");
    Count++;
    finite( Count);
  }  

    public static void main(String[] args) {
    int Count=0;

    finite( Count);
}





}
