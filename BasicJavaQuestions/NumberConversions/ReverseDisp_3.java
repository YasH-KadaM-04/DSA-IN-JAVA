package BasicJavaQuestions.NumberConversions;

public class ReverseDisp_3 {
    public static void main(String[] args) {

        
        int n=65767;
        while(n > 0){
            int rem = n % 10;  // Store rem which is the last digit if we divide by 10
            n=n/10; // Store First element  when divide by 10
            System.out.println(rem);
        }
    }
}
