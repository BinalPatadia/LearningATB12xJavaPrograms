package TestingAcademy_JavaTest;

import java.util.Scanner;

public class FindLargestofThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 3 Numbers:");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();
        int c = scanner2.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d is largest number" , a);
        } else if (b > a && b > c) {
            System.out.printf("%d is largest number" , b);
        } else if (c > a && c > b) {
            System.out.printf("%d is largest number" , c);

        } else {
            System.out.println("All are equal numbers");
        }
    }
}