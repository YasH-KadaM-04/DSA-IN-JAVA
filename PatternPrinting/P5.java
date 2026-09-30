
/* 
      *
    * *
  * * *
* * * *

*/
public class P5 {
public static void main(String[] args) {

    int sp =3;
    int str=1;
    for (int i = 1; i <= 4; i++) {


        for (int j = 1; j <=sp; j++) {
            System.out.print(" - ");
        }
          for (int j = 1; j <=str; j++) {
            System.out.print(" * ");
        }
        sp--;
        str++;
        System.out.println();
    }
}
}
