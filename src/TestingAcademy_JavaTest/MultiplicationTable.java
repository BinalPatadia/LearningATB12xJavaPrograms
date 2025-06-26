package TestingAcademy_JavaTest;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num=5;

        
        for(int i=1; i<=num; i++)
        {
            System.out.printf('\n'+"%d*1=%d", i,i*1);
            System.out.printf('\n'+"%d*2=%d", i,i*2);
            System.out.printf('\n'+"%d*3=%d", i,i*3);
            System.out.printf('\n'+"%d*4=%d", i,i*4);
            System.out.printf('\n'+"%d*5=%d", i,i*5);
            System.out.printf('\n'+"%d*6=%d", i,i*6);
            System.out.printf('\n'+"%d*7=%d", i,i*7);
            System.out.printf('\n'+"%d*8=%d", i,i*8);
            System.out.printf('\n'+"%d*9=%d", i,i*9);
            System.out.printf('\n'+"%d*10=%d", i,i*10);

            System.out.println('\n'+"------ Next Table--------- ");
        }
    }
}
