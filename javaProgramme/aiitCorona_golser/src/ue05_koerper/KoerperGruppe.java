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
    
    public boolean contains(Koerper k){
        
    }
    
    public boolean add(Koerper k){
        
    }
    
    public boolean remove(Koerper k){
        
    }
    
    public int size(){
        
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
