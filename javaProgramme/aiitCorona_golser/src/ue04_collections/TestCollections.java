package ue04_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author raphael
 */
public class TestCollections {

    public TestCollections () {
        Double x1 = 3.14;
        double x2 = 3.14;
        System.out.println("1: x1 == x2 => " + (x1 == x2));
        System.out.println("2: x1.equals(x2) => " + (x1.equals(x2)));
        System.out.println("-----------------------------------------");
        
        String s1 = "Hallo";
        String s2 = "Hallo"; //new String("Hallo");
        System.out.println("3: s1 == s2 => " + (s1 == s2));
        System.out.println("4: s1.equals(s2) => " + (s1.equals(s2)));
        System.out.println("-----------------------------------------");
        
        ArrayList l1 = new ArrayList();
        System.out.println("5: li.size() => " + l1.size());
        
        l1.add(x1);
        l1.add(x2);
        l1.add(s1);
        System.out.println("6: " + l1);
        System.out.println("7: li.size() => " + l1.size());
        
        l1.remove(1);
        System.out.println("8: " + l1);
        System.out.println("-----------------------------------------");
        
        ArrayList  l2 = (ArrayList)l1.clone();
        System.out.println("9: " + l2);
        System.out.println("10: l1 == l2 => " + (l1 == l2));
        System.out.println("11: " + l1.hashCode() + " " + l2.hashCode());
        System.out.println("12: " + System.identityHashCode(l1) + " " + System.identityHashCode(l2));
        
    }
    
    public static void main (String[] args) {
        new TestCollections();
    }
}
