
// /* linearly form 1 to N */
// import java.util.*;

// public class Problem2 {
//     public static int finite(int Count, int N) {
//         if (Count > N) {
//             return Count;
//         }

//         System.out.println(Count);
//         return finite(Count + 1, N);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Value of N");
//         int N = sc.nextInt();
//         int Count = 1;

//         finite(Count, N);
//         sc.close();
//     }
// }

/* linearly form N to 1 */
import java.util.*;

public class Problem2 {
    public static int finite(int Count, int N) {
        if (Count<1) {
            return Count;
        }

        System.out.println(Count);
        return finite(Count -1, N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of N");
        int N = sc.nextInt();
        int Count = N;

        finite(Count, N);
        sc.close();
    }
}