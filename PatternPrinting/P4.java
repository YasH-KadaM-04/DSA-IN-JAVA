
/* 




* * * *
  * * *
    * *
      *

*/
public class P4 {
public static void main(String[] args) {
     int sp=0;
     int str=4;

    for (int i = 1; i <= 4; i++) {

        for (int j = 1; j <=sp; j++) {
            System.out.print("  ");
        }
        for (int k=1; k<=str;k++){
            System.out.print("* ");
        }
        sp++;
        str--;
        System.out.println();
    }
}
}                                
