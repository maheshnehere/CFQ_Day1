package Logic;

import java.util.Scanner;

public class Perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0)
            {
                sum+=i;
            }
        }
        if (sum==number)
        {
            System.out.println(number+":is a perfect number");
        }
        else
        {
            System.out.println(number+":is not a perfect number");
        }
    }
}
