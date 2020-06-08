package ue05_koerper;

import java.util.Locale;

/**
 *
 * @author raphael
 */
public class Quader extends Koerper{
    private double a;
    private double b;
    private double h;

    public Quader (double a, double b, double h, double dichte) {
        super(dichte);
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    public Quader (double a, double b, double h) {
        super(0.0);
        if(a <= 0){
            throw new IllegalArgumentException("Invalid parameter a");
        }
        if(b <= 0){
            throw new IllegalArgumentException("Invalid parameter b");
        }
        if(h <= 0){
            throw new IllegalArgumentException("Invalid parameter h");
        }
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA () {
        return a;
    }

    public double getB () {
        return b;
    }

    public double getH () {
        return h;
    }

    public void setA (double a) {
        this.a = a;
    }

    public void setB (double b) {
        this.b = b;
    }

    public void setH (double h) {
        this.h = h;
    }
    
    @Override
    public double oberflaeche(){
        return 2 * (a * b + a * h + b * h);
    }
    
    @Override
    public double volumen(){
        return a * b + h;
    }

    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"a\":%e,\"b\":%e,\"h\":%e,\"dichte\":%e}", a, b, h, dichte);
    }
    
    
    
}
