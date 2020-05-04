package ue03_homeByteKit;


/**
 *
 * @author raphael
 */
public class Main {
    /**
     * 
     * Wandelt value (0 <= value <= 255) in ein Byte um.
     */
    public static byte fromUnsignedInt(int value){
        return (byte)value;
    }
    
    /**
     * Wandelt c in ein Byte um. Das High-Byte wird ignoriert.
     */
    public static byte fromChar(char c){
        return (byte)(c & 0xFF);
    }
    
    /**
     * Betrachtet value als vorzeichenloses byte und wandelt es
     * in eine Ganzzahl im Bereich 0..255 um.
     */
    public static int toUnsignedInt(byte value){
        return (value & 0x7F) + (value < 0 ? 128 : 0);
    }
    
    /**
     * Betrachtet value als vorzeichenloses byte und wandelt es
     * in ein Unicode-Zeichen mit High-Byte 0 um.
     */
    public static char toChar(byte value){
        return (char) toUnsignedInt(value);
    }
    
    /**
     * Liefert die Binaerdarstellung von value.
     */
    public static String toBitString(byte value){
        char[] chars = new char[8];
        int mask = 1;
        for(int i = 0; i < 8; ++i){
            chars[7 -i] = (value & mask) != 0 ? '1' : '0';
            mask <<= 1;
        }
        return new String(chars);
    }
    public static void main(String[] args){
        for(int i = 0; i < 256; ++i){
            System.out.print("i=" + i);
            byte b = fromUnsignedInt(i);
            System.out.print("b=" + toBitString(b));
            char c = toChar(b);
            System.out.print("c=" + (c >= 32 ? c : '.'));
            System.out.println();
        }
    }
        
}
