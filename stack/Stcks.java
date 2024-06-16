import java.util.Stack;
import java.util.Scanner;

/**
 * Class that constructs a Stack and prompts user to 
 * enter a list of numbers to be added to the stack. 
 * The stack is then sorted and printed.
 * 
 * @author Christian Crowley
 * @version 21.0.0
 * @since 6/8/2024
 */


public class Stcks {
    /**
     * Main Method. The only method.
     * Creates stack, uses scanner to take user input, adds input to stack.
     * Once user is done, stack is sorted and printed
     * @param args default params, not used
     * @since 6/8/2024
     */
    public static void main(String[] args) {
        
        // Creating Stack
        Stack<Integer> nums = new Stack<>();
        
    
        // Opening scanner to ask for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, type A when done");
        
        // Prompts user for a number until they are done, adds numbers to Stack
        while (true) {
            String b = sc.next();
            if (b.equalsIgnoreCase("A")){
                break;
            }

            else {
                int num = Integer.parseInt(b);
                nums.push(num);
            }
            }
        
        /// Sorts Stack
        nums.sort(null);

        // Prints sorted Stack
        System.out.println(nums);

        // Closes scanner
        sc.close();
    }

}

// To run the program, open project, go to command line, navigate to where you have the file stored and enter 'java Stcks.java'.
// To create javadocs, enter 'javadoc Stcks.java'.