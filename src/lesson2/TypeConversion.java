package lesson2;

/**
 * @author Protsko D.
 *         09.06.2017
 */
public class TypeConversion {
    
    @SuppressWarnings("UnnecessaryLocalVariable")
    public static void main(String[] args) {
        
        int intValue = 40;
        System.out.println("Integer value = " + intValue);
        
        /* Narrowing conversion:
         *
         * If you don't explicitly specify the type in
         * brackets, will be compilation error. */
        byte byteValue = (byte)intValue;
        System.out.println("Byte value = " + byteValue);
        
        // widening conversion
        long longValue = intValue;
        System.out.println("Long value = " + longValue);
    }
    
}
