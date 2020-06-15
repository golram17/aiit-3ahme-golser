package ue05_koerper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author raphael
 */
public class KoerperGruppe {
    private final List<Koerper> koerperliste = new ArrayList<>();
    private double dichte;

    public KoerperGruppe () {
    }

    public KoerperGruppe (Collection<Koerper> koerperliste, double dichte) {
        this.koerperliste.addAll(koerperliste);
        setDichte(dichte);
    }

    public double getDichte () {
        return dichte;
    }
    
    public final void setDichte (double dichte) {
        this.dichte = dichte;
        for(Koerper k: this.koerperliste){
            k.setDichte(dichte);
        }
    }

    public List<Koerper> getKoerperliste () {
        return koerperliste;
    }

    public boolean contains (Koerper k) {
        return koerperliste.contains(k);
    }

    public boolean add (Koerper k) {
        k.setDichte(dichte);
        return koerperliste.add(k);
    }

    public boolean remove (Koerper k) {
        return koerperliste.remove(k);
    }
    
    public int size(){
        return koerperliste.size();
    }
    
    public  Koerper[] toArray(){
        Koerper [] rv = new Koerper [koerperliste.size()];
        koerperliste.toArray(rv);
        return rv;
    }
    
    public double gesamtMasse(){
        double rv = 0.0;
        for(Koerper k: koerperliste){
            rv += k.masse();
        }
        return rv;
    }
    
    public double gesamtVolumen(){
        double rv = 0.0;
        for(Koerper k: koerperliste){
            rv += k.volumen();
        }
        return rv;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("[\n");
        boolean firstline = true;
        for(Koerper k: koerperliste){
            if(!firstline){
                firstline = false;
            }else{
                sb.append(",\n");
            }
            sb.append("   ").append(k.toString());
        }
        sb.append("[\n");
        return sb.toString();
    }
    
    
    
    
}
