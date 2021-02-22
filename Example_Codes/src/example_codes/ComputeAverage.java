
package example_codes;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter name
        String userName;
        System.out.println("Enter Your Name: ");
        userName = input.nextLine();
        
        //User input of three numbers
        System.out.println("Lets find the average of three numbers! ");
        System.out.println("Number 1: ");
        double number1 = input.nextDouble();
        System.out.println("Number 2: ");
        double number2 = input.nextDouble();
        System.out.println("Number 3: ");
        double number3 = input.nextDouble();
        
        //Compute the Average from numbers
        double average = (number1 + number2 + number3) / 3;
        
        //Display results
        System.out.println(userName + " the Average of " + number1+ ", " + number2 + ", " + number3 + " is " + average);
        
    }
    
}
