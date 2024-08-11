// Find average of 3 number using method function
/**
 * average
 */
import java.util.Scanner;
public class average {
public double findAverage(double num1,double num2 , double num3){
    double sum=num1+num2+num3;
    double average =sum/3;
    return Math.round(average*100.0)/100;
}
    
}
class tester{
    public static void main(String[]args){
        average avg=new average();
        Scanner s= new Scanner (System.in);
        System.out.println("Enter the number num1:");
        double num1=s.nextDouble();
        System.out.println("Enter the number num2:");
        double num2=s.nextDouble();
        System.out.println("Enter the number num3:");
        double num3=s.nextDouble();
        double Average = avg.findAverage ( num1, num2, num3);
        System.out.println("Average: " + Average);

}
}