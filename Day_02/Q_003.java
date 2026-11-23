package Day_02;

import java.util.Scanner;

public class Q_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int temp = num;
        int original = num;

        int totalDigit = 0;

        while (temp > 0) {
            temp = temp / 10;
            totalDigit++;

        }

        System.out.println(totalDigit);

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int mul = 1;

            for (int i = 1; i <= totalDigit; i++) {
                mul = mul * digit;
            }

            sum = sum + mul;
            num = num / 10;
        }

        System.out.println(sum);

        if (sum == original) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not a armstrong number");
        }

    }
}
