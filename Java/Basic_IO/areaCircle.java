package Basic_IO;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = scan.nextFloat();

        float area = (float) (3.14 * radius * radius);

        System.out.println("The area of circle is " + area + " cm2");

        scan.close();
    }
}