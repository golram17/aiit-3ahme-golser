package ue05_koerper;

/**
 *
 * @author raphael
 */
public abstract class Koerper {
   
    protected double dichte;
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;

    public Koerper (double dichte){
        if(dichte < 0){
            throw new IllegalArgumentException("Invalid parameter dichte");
        }
        
        this.dichte = dichte;
    }

    public double getDichte (){
        return dichte;
    }

    public void setDichte (double dichte){
        this.dichte = dichte;
    }
    
    public double masse (){
        return dichte * volumen();
    }
    
    public abstract double oberflaeche ();
    
    public abstract double volumen ();
}
