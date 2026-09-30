//Transpose of Matrix

// if Matrix is irregular 
public class Problem4 {
    public static void main(String[] args) {
    

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                transpose[j][i] = arr[i][j];

            }
        }

        // Print transpose
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
  
//if Matrix is Sqaure then We can use swaping
/* 
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}*/