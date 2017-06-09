package lesson2;

/**
 * @author Protsko D.
 *         09.06.2017
 */
public class Array {
    
    public static void main(String[] args) {
        // array creation
        // notice: in Java you must indicate an array length
        int[] array = new int[10];
        
        // populate the array with values
        for (int i = 0; i < array.length; i++) {
            // set value by index - (array..variable..name)[index] = (some..value)
            array[i] = i * 10;
        }
        
        // print array to console
        for (int i = 0; i < array.length; i++) {
            // get value by index - (array..variable..name)[index]
            System.out.print(array[i] + " ");
        }
    }
    
}
