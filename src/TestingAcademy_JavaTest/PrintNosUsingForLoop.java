package TestingAcademy_JavaTest;

import java.util.Scanner;

public class PrintNosUsingForLoop {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();

        for(int i=0;i<=a;i++){
            System.out.print(" "+i);

        }
    }
}
