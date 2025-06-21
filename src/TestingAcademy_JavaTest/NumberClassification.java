package TestingAcademy_JavaTest;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        if(a>0)
        {
            System.out.println("Positive number");
        } else if (a<0) {
            System.out.println("Negative number");
        }else {
            System.out.println("Number is zero");
        }
    }
}
