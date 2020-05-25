package ue05_koerper;

/**
 *
 * @author raphael
 */
public class Koerper {
   
    private double dichte;
    public final double DICHTE_EICHE = 670;
    public final double DICHTE_BUCHE = 690;

    public Koerper (double dichte) {
        this.dichte = dichte;
    }

    public double getDichte () {
        return dichte;
    }

    public void setDichte (double dichte) {
        this.dichte = dichte;
    }
    
    double masse (){
        
    }
    
    double oberflaeche (){
        
    }
    
    double volumen (){
        
    }
    
}
