
package example_code;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;
        
        System.out.println("Please Enter Radius: ");
        radius = input.nextDouble();
        
        area = radius * radius * 3.14;
        
        System.out.println("The area of the Circle with a radius of " + radius + " inches is " + area + " inches^2");
    }
    
}
