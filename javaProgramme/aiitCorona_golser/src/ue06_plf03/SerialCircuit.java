package ue06_plf03;

import java.util.List;

/**
 *
 * @author raphael
 */
public class SerialCircuit {
    private List<Component> components;
    private double current;

    public SerialCircuit (List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents () {
        return components;
    }

    public double getCurrent () {
        return current;
    }

    public void setCurrent (double current) {
        this.current = current;
    }
    
    public void add(Component C){
        C.setCurrent(current);
        components.add(C);
    }
    
    public double totalVoltage(){
        double rv = 0.0;
        for(Component c: components){
            rv += c.getVoltage();
        }
        return rv;
    }
    
    public double totalPower(){
        double rv = 0.0;
        for(Component c: components){
            rv += c.power();
        }
        return rv;
    }
    
    public double totalEnergy(){
        double rv = 0.0;
        for(Component c: components){
            rv += c.energy();
        }
        return rv;
    }
}
