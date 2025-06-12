package Ex01_JavaBasics;
import java.util.Scanner;
public class Array_triangle {
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 5
        //  *
        // ***
        //*****
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num e.g = 5");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j<=n-i ; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <=2*i-1 ; k++)
            {
                System.out.print("*");
        }
            System.out.println();
        }
    }
}