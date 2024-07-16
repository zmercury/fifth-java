package Basic_IO;

import java.util.Scanner;

public class areaSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the length of square: ");
        int length = scan.nextInt();

        int area = length * length;

        System.out.println("The area of square is " + area);

        scan.close();
    }
}
