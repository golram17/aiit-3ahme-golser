package ue05_koerper;

/**
 *
 * @author raphael
 */
public class Koerper {
   
    private double dichte;
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;

    public Koerper (double dichte) {
        this.dichte = dichte;
    }

    public double getDichte () {
        return dichte;
    }

    public void setDichte (double dichte) {
        this.dichte = dichte;
    }
    
    public double masse (){
        return dichte * volumen();
    }
    
    public double oberflaeche (){
       return dichte; 
    }
    
    public double volumen (){
        return dichte; 
    }
    
}
