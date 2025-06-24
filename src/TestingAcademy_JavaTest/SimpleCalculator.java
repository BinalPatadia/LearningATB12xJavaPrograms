package TestingAcademy_JavaTest;

import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.next;


public class SimpleCalculator {
    public static void main(String[] args) {
        //Write a program to create a simple calculator using switch statement.
        // **Requirements:** - Read two numbers and an operator (+, -, *, /) -
        // Use switch statement to perform the operation - Handle division by zero -
        // Display the result
        System.out.println("Enter 2 numbers:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        int result;
        System.out.println("operator +, -, *, /:");
        Scanner scanner3 = new Scanner(System.in);
        String operator=scanner3.next();
        switch (operator) {
            case "+":
                result = a + b;
                System.out.println("Addition Result" + result);
                break;
            case "-":
                if (a > b) {
                    result = a - b;
                    System.out.println("Subtraction Result" + result);
                } else {
                    System.out.println("a is smaller than b hence operation cannot be performed");
                }
                break;
            case "*":
                result = a * b;
                System.out.println("Multiplication Result" + result);
                break;
            case "/":
                if (a > b && a % b != 0) {
                    result = a / b;
                    System.out.println("Division Result" + result);
                } else {
                    System.out.println("a is smaller than b hence operation cannot be performed");
                }
                break;
            default:
                System.out.println("Enter valid numbers and operation");
        }
    }
}
