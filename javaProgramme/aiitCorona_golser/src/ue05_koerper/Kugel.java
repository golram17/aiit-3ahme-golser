package ue05_koerper;

/**
 *
 * @author raphael
 */
public class Kugel {
    private double r;

    public Kugel (double r) {
        this.r = r;
    }

    public Kugel (double r, double dichte) {
        
    }
    
    public double getR () {
        return r;
    }

    public void setR (double r) {
        this.r = r;
    }

    @Override
    public String toString () {
        return "Kugel{" + "r=" + r + '}';
    }

    
    double oberflaeche (){
        
        return 4 * Math.PI * r * r;
    }
    
    double volumen (){
        
        return (4 / 3) * Math.PI * r * r * r;
    }
}
