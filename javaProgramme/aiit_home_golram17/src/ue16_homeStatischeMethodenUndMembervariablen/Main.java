package ue16_homeStatischeMethodenUndMembervariablen;


/**
 *
 * @author raphael
 */
public class Main {
    private static final double STEUERSATZ = 18.9;//Konstante
    static private int objcnt = 0;
    
    public Main(){
        ++objcnt;
    }
    
    public void finalize(){
        --objcnt;
    }
    
    public static void main(String[] args){
        Main auto1;
        Main auto2 = new Main();
        System.out.println("Anzahl Testauto-Objekte" + Main.objcnt);
        //ueKlassenvariablen von Zeile 10 - 23 + Zeile 32 - 33
        
        double x, y;
        for(x = 0.0; x <= 10.0; x += 1.0){
            y = Math.sqrt(x);
            System.out.println("sqrt("+x+") = "+y);
            //ueKlassenmethoden Zeile 26 - 33 + Zeile 20
        }
    }
}

class Test{
    static int i;
    static int j;
    
    static{
        i = 5;
        j = 3 * i;
    }
    //ueStatischeInitialisierer Zeile 35 - 44
}
