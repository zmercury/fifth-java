package Basic_IO;

import java.util.Scanner;

public class addUserInputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any two numbers: ");

        int one = scanner.nextInt();
        int two = scanner.nextInt();

        int sum = one + two;

        System.out.print("The sum of " + one + " and " + two + " is " + sum);

        scanner.close();
    }
}
