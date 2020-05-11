package ue02_serienschaltung;

/**
 *
 * @author raphael
 */
public class TestSerienschaltung {
    public static void main (String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
         
        try {
            System.out.println("1: " + serienschaltung);
            serienschaltung.addWiderstand(10);
        } catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
            if(ex instanceof InvalidResistorValueException){
                double v = ((InvalidResistorValueException)ex).getInvalidValue();
            }
            
        }
        System.out.println("2 :" + serienschaltung);
        
        serienschaltung.setStrom(0.5);
        System.out.println("3: " + serienschaltung);
        
        try {
            serienschaltung.addWiderstand(100E6);
        } catch (InvalidResistorValueException ex){
            if(ex.getInvalidValue() < 0){
                throw new TestFailedException(ex);
            }
            System.out.println("Widerstand zu groß");
        } catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
            
        }
        System.out.println("4: " + serienschaltung);
        
        try {
            serienschaltung.addWiderstand(20);
        } catch (Exception ex) {
            System.out.println("Fehler aufgetreten");
            System.out.println(ex.getMessage());
            
        }
        System.out.println("5: " + serienschaltung);
        
        serienschaltung.setStrom(1);
        System.out.println("6: " + serienschaltung);
    }
}
