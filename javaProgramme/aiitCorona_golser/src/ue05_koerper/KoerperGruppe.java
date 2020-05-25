package ue05_koerper;

import java.util.Collection;
import java.util.List;
/**
 *
 * @author raphael
 */
public class KoerperGruppe {
    private final List<Koerper> koerperliste = new List<>();
    private double dichte;

    public KoerperGruppe () {
    }

    public KoerperGruppe (Collection<Koerper> koerperliste, double dichte) {
        this.dichte = dichte;
    }

    public double getDichte () {
        return dichte;
    }
    
    public void setDichte (double dichte) {
        this.dichte = dichte;
    }

    public List<Koerper> getKoerperliste () {
        return koerperliste;
    }
    
    
}
