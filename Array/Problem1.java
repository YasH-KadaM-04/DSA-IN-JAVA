import java.util.*;
//Searching element
public class Problem1 {

    static int Search(int[] arr, int Key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == Key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element you want to search: ");
        int Key = sc.nextInt();

        int result = Search(arr, Key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}