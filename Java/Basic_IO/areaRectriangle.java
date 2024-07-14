package Basic_IO;

import java.util.Scanner;

public class areaRectriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter the length of the rectriangle: ");
        int length = scan.nextInt();
        System.out.print("Enter the breath of the rectriangle: ");
        int breath = scan.nextInt();
    
        int area = length * breath;
    
        System.out.println("The area of rectringle is " + area + " cm2");
    
        scan.close();
    }
}
