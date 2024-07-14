package Basic_IO;

import java.util.Scanner;

public class userInputString {
    public static void main(String[] args) {
        //create a scanner object to scan the user input 
        Scanner scanner = new Scanner(System.in);
        
        //print a string for user
        System.out.print("Enter your name: ");
        
        //create a string variable to store the name
        String name = scanner.next();

        //print our the name entered by the user
        System.err.print("Hello " + name);

        //close scanner
        scanner.close();
    }
}
