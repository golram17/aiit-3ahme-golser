package ue01_taschenrechner;

import java.util.Scanner;


/**
 *
 * @author raphael
 */



public class TestTaschenrechner{
    public static void main(String[] args){
        
     Taschenrechner wert = new Taschenrechner(1.0, 2);
    
     System.out.println("  Addition: "+wert.getAdditionResult());
     System.out.println("  Subtraktion: "+wert.getSubtractionResult());
     System.out.println("  Multiplikation: "+wert.getMultiplicationResult());
     System.out.println("  Division: "+wert.getDivisionResult());
     
    }
}
