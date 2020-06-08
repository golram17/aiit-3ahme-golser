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
        this.dichte = dichte;
        for(Koerper k : this.koerperliste){
            k.setDichte(dichte);
        }
    }

    public double getDichte () {
        return dichte;
    }
    
    public void setDichte (double dichte) {
        this.dichte = dichte;
        for(Koerper k : this.koerperliste){
            k.setDichte(dichte);
        }
    }

    public List<Koerper> getKoerperliste () {
        return koerperliste;
    }

    public boolean contains (Object k) {
        return koerperliste.contains(k);
    }

    public boolean add (Koerper k) {
        return koerperliste.add(k);
    }

    public boolean remove (Object k) {
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
    
    public Koerper koerper(int index){
        
    }
    
    public Koerper[] toArray(){
        
    }
    
    public double gesamtMasse(){
        
    }
    
    public double gesamtVolumen(){
        
    }

    @Override
    public String toString () {
        return "KoerperGruppe{" + "koerperliste=" + koerperliste + ", dichte=" + dichte + '}';
    }
    
    
    
    
}
