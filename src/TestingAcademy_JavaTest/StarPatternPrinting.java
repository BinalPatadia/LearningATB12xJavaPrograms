package TestingAcademy_JavaTest;

import java.util.Scanner;

public class StarPatternPrinting {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        for(int i=n;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }scanner.close();



    }


}
