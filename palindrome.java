//To check Palindrome//
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        String  reverse="";
        Scanner s  =new Scanner(System.in);
        System.out.println("Enter the string:");
        String name= s.nextLine();
        int length=name.length();
      
        for(int i=length-1;i>=0;i--){
            reverse= reverse+name.charAt(i);
        if(name.equals(reverse))
            System.out.println("palindrome");
        
        }
          System.out.println("It is not a Palindrome");
        
    
        
        

    }
    
}
