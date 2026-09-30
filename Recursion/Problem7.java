// /*Check Palindrom*/
// public class Problem7
// {
// 	public static void main(String[] args) {
// String Name="MaYam";

//  Name = Name.toLowerCase();

// int R=Name.length()-1;
// 	boolean result=true;
// for (int i=0;i<Name.length() ;i++){
//     if(i>=R){
//         break;
//     }
    
//    else if(Name.charAt(i)==Name.charAt(R)){
//         R--;
//     }
//     else{
//         result=false;
//     	break;
        
//     }
// }
//         if(result==false){
//             	System.out.println(" No Given String is Not Palindrome");
//         }
//         else{
//             	System.out.println(" Yes Given String is Palindrome");
//         }


// 	}
// }





/*Check Palindrom*/
public class Problem7
{
    public  static void Display(boolean result){
    
        if(result==false){
            	System.out.println(" No Given String is Not Palindrome");
        }
        else{
            	System.out.println(" Yes Given String is Palindrome");
        }
    }


    public static boolean Check(int i,int R,boolean result,String Name ){
        if (i>=R){
            return result;
        }
//Swap
if(Name.charAt(i)==Name.charAt(R)){
        R--;
    }
    else{
        result = false;
            return result;
    
    }
    return Check(i+1, R, result, Name);

    }
	public static void main(String[] args) {
        String Name="NaYAN";
        int R=Name.length()-1;

 Name = Name.toLowerCase();
boolean result = Check(0, R, true, Name);
Display(result);

	}
}