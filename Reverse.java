// To reverse a number or string
import java.util. Scanner;
public class Reverse {
    public static void main(String []args){
        String reverse="";
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the name:");
       String name=s.nextLine();
       int lenght=name.length();

       for(int i=lenght-1;i>=0;i--){
          reverse= reverse+name.charAt(i);
          
       }
       System.out.println(reverse);
    }
}
