/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue14_homeVererbung;


/**
 *
 * @author raphael
 */
public class Main {
    public String name;
    public int erstzulassung;
    public int leistung;
    
    
    
    public static void main(String[] args){
    Main meinKombi = new Main();
    /*
     * Gleich wie:
     * Main meinKombi;
     * meinKombi = new Main();
     */
    meinKombi.name = "Mercedes 600";
    meinKombi.erstzulassung = 1972;
    meinKombi.leistung = 250;
    
    System.out.println("Name........."+meinKombi.name);
    System.out.println("Zugelassen..."+meinKombi.erstzulassung);
    System.out.println("Leistung....."+meinKombi.leistung);
    
    int a = 3;
    
    meinKombi.printAlter(a);
    meinKombi.printAlter(a);
    meinKombi.printAlter(a);//9 Mal Alter ausgeben
    
    }
    
    public int alter(){
        return 2000 - erstzulassung;
    }//Art von Eingabe des Alters

    public void printAlter(int wieOft){
        while(wieOft --> 0){
            System.out.println("Alter = "+ alter());
        }
    }//Art von Ausgabe des Alters
  
    public int alter(String titel){
        /*Name darf zweimal in einer Class gleich sein muss aber
         * andere Parameter haben damit der Compiler sie unterscheidet
         Dies nennt man Überladen*/
        int alter = alter();
        System.out.println(titel + alter);
        return alter;
    } 
}

class Cabrio extends Main{//die class Cabrio erbt mit extends alle eigenschaften von der class Main
    int vdauer;
    
    public static void main(String[] args){
        Cabrio kfz1 = new Cabrio();
        
        kfz1.name = "MX5";//durch extends kann Cabrio sogar auf alle Variablen in Main zugreifen
        kfz1.erstzulassung = 1994;
        kfz1.leistung = 115;
        kfz1.vdauer = 120;
        System.out.println("Alter = "+kfz1.alter());//auch auf Funktionen hat Cabrio zugriff
    }
}

class ZweisitzerCabrio extends Cabrio{
    boolean notsitze;
    
    public static void main(String[] args){
        ZweisitzerCabrio kfz1 = new ZweisitzerCabrio();
        kfz1.name = "911-T";
        kfz1.erstzulassung = 1982;
        kfz1.leistung = 94;
        kfz1.vdauer = 50;
        kfz1.notsitze = true;
    }
    
    public int alter2(){
        return 12* (2000 - erstzulassung);
    }
    
    public void printAlter2(int wieOft){
        while(wieOft --> 0){
            System.out.println("Alter = "+ alter2());
        }
    }
}