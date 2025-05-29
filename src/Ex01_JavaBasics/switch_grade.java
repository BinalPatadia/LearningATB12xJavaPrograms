package Ex01_JavaBasics;

import java.util.Scanner;
public class switch_grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade:");

        String grade = scanner.next();
       // grade = grade.toLowerCase();

        switch (grade)
        {
            case "A":
                System.out.println("Excellent");
                break;

            case "B":
            System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
            System.out.println("Needs Improvement");
                break;
            case "F":
            System.out.println("Fail");
                break;
            default:
            System.out.println("Invalid grade");
        }
    }
}
