package TestingAcademy_JavaTest;

import java.util.Scanner;

public class Day_of_Week {
    public static void main(String[] args) {

        System.out.println("Enter the Number between 1-7:");
        Scanner scanner = new Scanner(System.in);

            if (!scanner.hasNextInt()) {
                System.out.println("Enter the int,rerun the program");
            }



            int daynumber = scanner.nextInt();
            switch (daynumber) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        }
    }
