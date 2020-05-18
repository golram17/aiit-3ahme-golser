package ue02_serienschaltung;

/**
 *
 * @author raphael
 */
public class Serienschaltung {
    private double strom;
    private double spannung;
    private double[] widerstandsFeld;
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException{
        if (widerstandInOhm < 0 || widerstandInOhm > 10E6){
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        if(widerstandsFeld == null){
            widerstandsFeld = new double [1];
            widerstandsFeld[0] = widerstandInOhm;
        }else{
            double [] f = new double[widerstandsFeld.length +1];
            for(int i = 0; i < widerstandsFeld.length; i++){
                f[i] = widerstandsFeld[i];
            }
            f[widerstandsFeld.length] = widerstandInOhm;
            widerstandsFeld = f;
        }
        updateSpannung();
          
    }

    public double getStrom () {
        return strom;
    }

    public double getSpannung () {
        return spannung;
    }

    public void setStrom (double strom) {
        this.strom = strom;
        updateSpannung();
    }

    @Override
    public String toString () {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
    }
    
   
    
    private void updateSpannung(){
        double rges = 0.0;
        //foreach Schleife
        if (widerstandsFeld == null) {
            spannung = 0;
            return;
        }
            
        for( double r : widerstandsFeld){
            rges += r;
        }
        spannung = strom * rges;
        
    }
}
