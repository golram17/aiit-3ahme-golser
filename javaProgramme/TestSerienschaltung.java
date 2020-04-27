package ue02_serienschaltung;

/**
 *
 * @author raphael
 */
public class TestSerienschaltung {
    public static void main (String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        
        System.out.println("1: " + serienschaltung);
        serienschaltung.addWiderstand(10);
        
        System.out.println("2:");    
    }
}
