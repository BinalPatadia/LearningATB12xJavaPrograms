package Ex01_JavaBasics;

import java.util.Scanner;

public class switch_month_leapyear {
    public static void main(String[] args) {
//        Write a Java program that takes a month number (1-12) and prints the
//        number of days in that month using a switch statement.
//        Handle February separately for leap years.
// a year is a leap year if it is divisible by 4, but not by 100,
// unless it is also divisible by 400.
        //Input -> 1 to 12, and Year = 2025
        //-> 1 and year 2025 -> 31 Days
        //      -> 2 and year 2025 -> 28 Days, ( 2025 leap)
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
               /*switch (year)*/ {
                    //case 2:
                        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
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






