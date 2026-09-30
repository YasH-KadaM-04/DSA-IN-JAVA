package BasicJavaQuestions.NumberConversions;
import java.util. Scanner;
 public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Digit ");
        
        int Digit=sc.nextInt();
        System.out.println("Enter the  IntialBase of the Digit ");
        int IB=sc.nextInt();
        System.out.println("Enter the AB to which you want to convert the digit ");
        int AB=sc.nextInt();
       
        int rem=0,sum=0;
        int result=Calculate(Digit,AB,rem, IB,sum);
        System.out.println("The converted digit is: " + result);

    sc.close();

    }
    public static int Calculate(int Digit, int AB, int rem,int IB,int sum){
        
        int P=1;
        while(Digit>0){
            rem=Digit%AB;
            Digit=Digit/AB;
            sum=sum+(rem*P);
            P=P*IB;
        }
        return sum;
    }
}
