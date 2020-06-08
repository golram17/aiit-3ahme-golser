package ue05_koerper;

import java.util.Locale;

/**
 *
 * @author raphael
 */
public class Kugel extends Koerper{
    private double r;

    public Kugel (double r) {
        super(0.0);
        if(r <= 0){
            throw new IllegalArgumentException("Invalid parameter r");
        }
        this.r = r;
    }

    public Kugel (double r, double dichte) {
        super(dichte);
        this.r = r;
    }
    
    public double getR () {
        return r;
    }

    public void setR (double r) {
        this.r = r;
    }

    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"r\":%e,\"dichte\":%e}", r, dichte);
    }

    
    @Override
    public double oberflaeche (){
        
        return 4 * Math.PI * r * r;
    }
    
    @Override
    public double volumen (){
        
        return (4 / 3) * Math.PI * r * r * r;
    }
}
