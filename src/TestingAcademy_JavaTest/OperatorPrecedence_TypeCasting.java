package TestingAcademy_JavaTest;

public class OperatorPrecedence_TypeCasting {
    public static void main(String[] args) {
        byte b=100;
        int a=b;
        int c=100;
        byte d=(byte)c;

        int e= c+d;
        int f=a+(int)b;
        System.out.println(e);
        System.out.println(f);
    }
}
