package ue05_homeReferenzgleichheit;


/**
 *
 * @author raphael
 */
public class Main {
    public static void main(String[] args){
        /*
         * String a = new String("hallo");
         * String b = new String("hallo");
         * System.out.println("a == b liefert " + (a == b));
         * System.out.println("a != b liefert " + (a != b));
         * Falsch wegen string.intern weshalb Strings nicht gleich groß sind obwohl sie das gleiche Zeichen sind.
         */
        String a = new String("hallo");
        String b = new String("hallo");
        System.out.println("a.equals(b) liefert " + a.equals(b));
    }
}
