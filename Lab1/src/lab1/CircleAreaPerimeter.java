package lab1;
/*
 * Lab #1 
 * Source Code File: CircleAreaPerimeter.java 
 * Programmer: Stephanie Ramirez
 * Due: 2/24/21
 * Description: This is a Java programming that displays 
 * the area an perimeter of a circle with a radius of 5.5
 */
public class CircleAreaPerimeter {
    public static void main(String[] args){
        double radius = 5.5;
        final double PI = 3.14159;
        double perimeter = 2 * radius * PI; 
        double area = radius * radius * PI;
        
        System.out.println("The perimeter of the circle of radius " + radius + " is = " + perimeter);
        System.out.println("The area of the circle of radius " + radius + " is = " + area);
    }
    
}
