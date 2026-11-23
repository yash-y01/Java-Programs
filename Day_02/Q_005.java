package Day_02;

import java.util.Scanner;

public class Q_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int gcd = 1;
        int i = 1;

        while (i <= num1 && i <= num2) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }

            i++;
        }

        System.out.println("GCD = " + gcd);
    }
}
