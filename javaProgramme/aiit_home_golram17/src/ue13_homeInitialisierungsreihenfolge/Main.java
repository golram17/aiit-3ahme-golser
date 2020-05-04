package ue13_homeInitialisierungsreihenfolge;


/**
 *
 * @author raphael
 */

/*
 * 1) Werden die Superkonstruktoren aufgerufen
 * 2) Werden alle Membervariablen in textueller Reihenfolge ihrer Deklaration initiaisiert
 * 3) Wird der Programmcode im Rumpf des Konstruktors ausgeführt
 */
public class Main {
    public static String getAndPrint(String s){
        System.out.println(s);
        return s;
    }
    
    public static void main(String[] args){
        Son son = new Son();
    }
    
    /*
     * protected void finalize(){
     * }
     * //Destruktor werden vor dem Zerstören eines Objekts aufgerufen.
     * //Ist immer mit protected und Paraneter los zum erstellen und heißt immer finalize
     */
    
}

class Father{
        private String s1 = Main.getAndPrint("Father.s1");
        
        public Father(){
            Main.getAndPrint("Father.<init>");
        }
    }

class Son
extends Father{
    private String s1 = Main.getAndPrint("Son.s1");
    
    public Son(){
        Main.getAndPrint("Son.<init>");
    }
}