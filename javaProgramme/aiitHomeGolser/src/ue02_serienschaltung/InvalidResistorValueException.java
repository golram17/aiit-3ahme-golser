package ue02_serienschaltung;

/**
 *
 * @author raphael
 */
public class InvalidResistorValueException extends Exception{
    private final double invalidValue;
    
    public InvalidResistorValueException (double invalidValue) {
        super("fehlerhafter Widerstandswert" + invalidValue);
        this.invalidValue = invalidValue;
    }

    public double getInvalidValue () {
        return invalidValue;
    }
    
}
