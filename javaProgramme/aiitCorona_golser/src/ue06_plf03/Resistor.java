package ue06_plf03;


/**
 *
 * @author raphael
 */
public class Resistor extends Component{
    
    public Resistor (double value) {
        super("R?", value);
    }

    public Resistor (double value, String id) {
        super(id, value);
    }

    @Override
    public String unit () {
        return "\u2126";
    }

    @Override
    public double energy () {
        return 0;
    }
    
    
}
