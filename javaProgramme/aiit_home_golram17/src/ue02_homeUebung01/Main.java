package ue02_homeUebung01;


/**
 *
 * @author Raphael Golser
 */
public class Main {
    
    public static void main (String[] args){
        int a;
        a = 1;
        char b = 'x';
        System.out.println(a);
        double c = 3.1415;
        System.out.println(b);
        System.out.println(c);
        boolean d = false;
        System.out.println(d);
        
        int[] prim = new int[5];
        boolean[] e = {true, false};
        prim[0] = 2;
        prim[1] = 3;
        prim[2] = 5;
        prim[3] = 7;
        prim[4] = 11;
        
        System.out.println("prim hat "+prim.length+" Elemente");
        System.out.println("e hat "+e.length+" Elemente");
        System.out.println(prim[0]);
        System.out.println(prim[1]);
        System.out.println(prim[2]);
        System.out.println(prim[3]);
        System.out.println(prim[4]);
        System.out.println(e[0]);
        System.out.println(e[1]);
        
        int[][] f = new int [2][3];
        
        f[0][0] = 1;
        f[0][1] = 2;
        f[0][2] = 3;
        f[1][0] = 4;
        f[1][1] = 5;
        f[1][2] = 6;
        System.out.println(""+f[0][0]+f[0][2]);
        System.out.println(""+f[1][0]+f[1][1]+f[1][2]);
        
        int[][] g = { {0},
                      {1, 2},
                      {3, 4, 5},
                      {6, 7, 8, 9}
                    };
        for(int i = 0; i < g.length; ++i){
            for(int j = 0; j < g[i].length; ++j){
                System.out.println(g[i][j]);
            }
            System.out.println();
        }
    }
    
    
    
    
}
