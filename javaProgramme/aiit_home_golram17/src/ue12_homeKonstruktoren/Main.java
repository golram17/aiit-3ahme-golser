package ue12_homeKonstruktoren;


/**
 *
 * @author raphael
 */
public class Main {
    public String name;
    public int erstzulassung;
    public int leistung;
    
    public Main(String name){
        /*
         * Konstruktor muss gleichen Namen wie class haben und
         * kann Überladen werden und kann unendlich viele Parameter haben
         * und sie haben keinen Rückgabewert
         */
        this.name = name;
    }
    
    public Main(String name, int erstzulassung, int leistung){
        this(name);//verkettung von Konstruktoren, durch Klammern weiss Compiler das das die Variable vom anderen Konstruktor ist
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
    }
    
}
