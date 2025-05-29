package Ex01_JavaBasics;

public class logicalHackerrankprog {
    public static void main(String[] args) {

//        three input values representing the lengths of the sides,
//                determine if the triangle is equilateral (all sides are equal),
//        isosceles (exactly two sides are equal), or scalene (no sides are equal).
//                Use an if-else statement to classify the triangle.

        //using ternary operator

  int n1= Integer.parseInt(args[0]);
  int n2= Integer.parseInt(args[1]);
  int n3= Integer.parseInt(args[2]);

 //  string result = (n1==n2 && n2==n3) ? (n1==n2 || n1==n3) ? "Equilateral triangle" : "isosceles  triangle":(n1!=n2 && n2!=n3)? "scalene":"isosceles  triangle" ;

        //using if-else
        
     if(n1==n2 && n2==n3)
        {
            System.out.println("Equilateral triangle");
            
        }else if(n1==n2 || n1==n3)
        {
            System.out.println("isosceles  triangle");
            
        }else
        {
            System.out.println("scalene");
        }

    }


}
