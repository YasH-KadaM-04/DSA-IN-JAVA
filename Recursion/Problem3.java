/* In Problem 2, we have to print numbers from 1 to N and  from N to 1.

In the first approach, we increment the value and print it every time.

But in **backtracking**, we do something different. 

First, we **execute all the recursive calls without printing anything**. When we reach the end, the function starts **returning (backtracking)**.

While the function is returning, we perform the required task, such as printing the number.

So, the basic idea of backtracking is:

**Go forward → Complete the recursive calls → Come back → Perform the task while returning.**

In simple words:

> **First go deep into the recursion, and then perform the task while coming back.**

This process of going forward and then coming back is called **backtracking**.


*/

// //Using Backtracking from N to 1
// import java.util.*;

// public class Problem3 {
//     public static void LinearCall(int n, int count) {
//         if (count > n) {
//             return;
//         }

//         LinearCall(n, count+1);
//         System.out.println(count);

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Value of N:");
//         int n = sc.nextInt();
//         int count = 1;
//         LinearCall(n, count);
//         sc.close();
//     }

// }

import java.util.*;

public class Problem3 {
    public static void LinearCall(int n, int count) {
        if (count < 1) {
            return ;
        }

       LinearCall(n, count-1);
        System.out.println(count);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of N:");
        int n = sc.nextInt();
        int count = n;
        LinearCall(n, count);
        sc.close();
    }

}
