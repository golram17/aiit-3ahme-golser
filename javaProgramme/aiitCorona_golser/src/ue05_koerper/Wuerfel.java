package ue05_koerper;

/**
 *
 * @author raphael
 */
public class Wuerfel extends Koerper{
    private double a;

    public Wuerfel (double a, double dichte) {
        super(dichte);
        this.a = a;
    }

    public Wuerfel (double a) {
        super(Koerper.DICHTE_EICHE);
    }

    public double getA () {
        return a;
    }

    public void setA (double a) {
        this.a = a;
    }
    
    @Override
    public double oberflaeche(){
        return 6 * a;
    }
    
    @Override
    public double volumen(){
        return a * a * a;
    }

    @Override
    public String toString () {
        return "Wuerfel{" + "a=" + a + '}';
    }
    
    
    
}
