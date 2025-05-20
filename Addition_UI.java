
// Addition of two numbers using Scanner class
import java.util.Scanner;

public class Addition_UI {
    public static void main(String[] args) {
        Scanner addition = new Scanner(System.in);

        // Getting user input for 1st number
        System.out.println("Enter 1st number: ");
        int a = addition.nextInt();

        // Getting user input for 2nd number
        System.out.println("Enter 2nd number: ");
        int b = addition.nextInt();
        
        System.out.println( a + b);
        
        addition.close();
        // Closing the scanner object to prevent resource leaks
}
}
