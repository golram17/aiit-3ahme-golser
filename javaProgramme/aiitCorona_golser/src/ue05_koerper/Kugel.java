package ue05_koerper;

/**
 *
 * @author raphael
 */
public class Kugel extends Koerper{
    private double r;

    public Kugel (double r) {
        super(Koerper.DICHTE_EICHE);
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
        return "Kugel{" + "r=" + r + '}';
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
