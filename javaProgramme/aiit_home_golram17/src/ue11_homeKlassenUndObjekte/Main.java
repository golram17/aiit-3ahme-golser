package ue11_homeKlassenUndObjekte;


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
