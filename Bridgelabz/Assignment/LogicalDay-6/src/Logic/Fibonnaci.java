package Logic;

public class Fibonnaci {

    public static void main(String[] args) {
        int num1=0,num2=1,num3;

        for (int i = 2;i<20;i++)
        {
            num3=num1+num2;

            System.out.println(""+num3);
            num1 = num2;
            num2 = num3;
        }

    }
}
