/* here's the program that is for simply calculator using constructor and methods */

public class Simplycalc {
    public double add (double  num1 , double num2){
        return num1+num2;
    }
    public double sub(double num1, double num2){
        return num1-num2;
    }
    public double multi (double num1, double num2){
        return num1*num2;
    }
    public double div (double num1, double num2){
        if(num2==0){
            System.out.println("Invalid!");
        }
            return num1/num2;
          
    }
}
class Tester{
    public static void main(String[] args) {
        Simplycalc calc=new Simplycalc();
    double num1=2;
    double num2=9;
    System.out.println("Addition"+ calc.add(num1,num2));
    }
    
}

