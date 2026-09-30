
/* 
  * * * *
  * * *
  * *
  *

*/
// public class P6 {
// public static void main(String[] args) {

//     for (int i=4; i>=1; i--){
// for (int j=1; j<=i;j++){
//  System.out.print(" * ");
// }
    
//         System.out.println();
//     }
// }
// }




public class P6 {
public static void main(String[] args) {





    int sp =0;
    int str=4;
    for (int i = 1; i <= 4; i++) {

        /* print Str */
  for (int j = 1; j <=str; j++) {
            System.out.print(" * ");
        }

        /* print Sp */
        for (int j = 1; j <=sp; j++) {
            System.out.print(" - ");
        }


        
        sp++;
        str--;

System.out.println();
    }
    
}
}