package Logic;

import java.util.Scanner;

public class Primenumber {
    public static boolean isprime ( int num){
        if (num <= 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (isprime(num))
        {
            System.out.println(num+"Is a prime number");
        }
        else {
            System.out.println(num+"not a prime number");
        }
    }
}