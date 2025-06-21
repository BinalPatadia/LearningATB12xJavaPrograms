package TestingAcademy_JavaTest;

import java.util.Scanner;

public class Comparison_Logical_Operators {
    public static void main(String[] args) {
        //a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
    //- Use comparison operators (==, !=, <, >, <=, >=)
        //- Use logical operators (&&, ||, !)
        //- Print boolean results with explanatory messages

        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println((a > b) && (a > 0));
        System.out.println((a < b) || (a > 0));
        System.out.println(!(a > b));

    }
}
