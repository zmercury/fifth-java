package Basic_IO;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double p = scan.nextDouble();
        
        System.out.print("Enter the time: ");
        double t = scan.nextDouble();
        
        System.out.print("Enter the rate: ");
        double r = scan.nextDouble();

        double si = (p * t * r) / 100;

        System.out.println("The simple interest is " + si);

        scan.close();
    }
}
