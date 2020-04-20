package ue02_serienschaltung;

/**
 *
 * @author raphael
 */
public class Serienschaltung {
    private double strom;
    private double spannung;
    private double[] widerstandsFeld;
    
    public void addWiderstand(double widerstandInOhm){
        widerstandInOhm = this.widerstandsFeld.length;
        
        Serienschaltung spannungBerechnen = new Serienschaltung();
        
        spannungBerechnen.updateSpannung();
        
        
    }

    public double getStrom () {
        return strom;
    }

    public double getSpannung () {
        return spannung;
    }

    public void setStrom (double strom) {
        this.strom = strom;
    }

    @Override
    public String toString () {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }
    
   
    
    private void updateSpannung(){
        this.spannung = this.strom * this.widerstandsFeld.length;
        
    }
}