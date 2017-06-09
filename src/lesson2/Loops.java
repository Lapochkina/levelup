package lesson2;

/**
 * @author Protsko D.
 *         09.06.2017
 */
public class Loops {
    
    public static void main(String[] args) {
        
        // for loop
        /* This loop on each iterate will check a condition
         * in the middle of construction. After each iterate
         * will executed code after second semicolon.
         * This loop commonly used, when we know (or have) certain
         * quantity of iterations. */
    
        System.out.println("*** for loop ***");
        // This code 10 times will print "Hello, world!"
        for (int i = 0; i < 10; i++){
            System.out.println("Hello, world!");
        }
    
        System.out.println();
        System.out.println("*** while loop ***");
        
        /* while loop
         * This loop form on each iteration validate condition in brackets
         * and if it's true will execute code in the loop.
         * The code in this loop may not execute once. */
        int index = 40;
        int count = 0;
        while (index < 45) {
            count++;
            index++;
        }
        System.out.println("Count of iterations of while loop = " + count);
    
        System.out.println();
        System.out.println("*** do...while loop ***");
        
        /* do..while
         * In this loop, in the beginning will execute the code, and only then
         * check condition.
         * The code in this loop will execute at least once. */
        int doWhileIndex = 10;
        int doWhileCount = 0;
        do {
            doWhileCount++;
            doWhileIndex += 10;
        } while (doWhileIndex < 100);
        System.out.println("Count of iterations of do..while loop = " + doWhileCount);
        
    }
    
}
