package Ex01_JavaBasics;

public class Adult_Minor_ternary {
    public static void main(String[] args) {

        //You have to figure it out if I am an adult, minor, or senior.
        // What is the condition? The condition is very simple.
        // If my age is greater than 18, then I can be minor or adult or senior.
        // But if my age is greater than 65, then I am a senior.
        // If I am between 18 to 65, then I am an adult.

       int age = 10;

       //age>18 ? "adult" : minor
        // age>65 ? "Senior" : Adult
String result= (age>18) ? (age>65 ? "Senior" : "Adult") : "minor";

   //     String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "You can't Drink") : "You can't go GOA";
        System.out.println(result);

    }

}
