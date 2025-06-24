package TestingAcademy_JavaTest;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month in number and year:");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        switch (month) {

            case 1, 3, 5, 7, 10, 12:
                System.out.println("31 days");
                break;

            case 4, 6, 8, 9, 11:
                System.out.println("30 days");
                break;
            case 2:
            {
                if (year % 4 == 0 || year % 400 == 0) {
                    System.out.println("29 days as it is leap year");
                } else {
                    System.out.println("28 days");
                }

            }
            break;
            default:
                System.out.println("Invalid month and year");
        }
    }
}
