package ue06_homeBitweisenOperatoren;


/**
 *
 * @author raphael
 */
public class Main {
    
    public static void main(String[] args){
        int i = 55;
        int j = 97;
        if((i & 15) < (j & 15)){//nicht i & 15 < j & 15 wegen Operatorvorrrang
            System.out.println("LowByte(55) < LowByte(97)");
        }else{
            System.out.println("LowByte(55) >= LowByte(97)");
        }
    }
}
