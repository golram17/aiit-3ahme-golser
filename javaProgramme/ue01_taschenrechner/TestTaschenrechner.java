package ue01_taschenrechner;

import java.util.Scanner;


/**
 *
 * @author raphael
 */
class Taschenrechner{
    /*private*/  double a;
    /*private*/  double b;
    
    /*public Taschenrechner(double a, double b){
        this.a = a;
        this.b = b;
    }*/
    
    double getAdditionResult(){
        return a + b;
    }
    
    double getSubtractionResult(){
        return a - b;
    }
    
    double getMultiplicationResult(){
        return a * b;
    }
    
    double getDivisionResult(){
        return a / b;
    }
}


public class TestTaschenrechner extends Taschenrechner{
    public static void main(String[] args){
     Scanner eingabewert = new Scanner(System.in);
     TestTaschenrechner wert = new TestTaschenrechner();
     
     System.out.println("Wert a: "); 
     wert.a = eingabewert.nextDouble();
     
     System.out.println("Wert b: "); 
     wert.b = eingabewert.nextDouble();
     
     System.out.println("  Addition: "+wert.getAdditionResult());
     System.out.println("  Subtraktion: "+wert.getSubtractionResult());
     System.out.println("  Multiplikation: "+wert.getMultiplicationResult());
     System.out.println("  Division: "+wert.getDivisionResult());
     
    }
}
