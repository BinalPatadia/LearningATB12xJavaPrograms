package Ex01_JavaBasics;

public class Max_number_ternary_operator {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        int n3=30;

       // String Max= N1>N2 ? N3 > N1 && N2 ? N3 "is Max" : N2 "is Max";


        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);

    }

}
