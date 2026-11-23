package Day_02;

import java.util.Scanner;

public class Q_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int original = num;

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            int mul = 1;
            for (int i = 1; i <= digit; i++) {
                mul = mul * i;
            }

            sum = sum + mul;
            num = num / 10;
        }
        
        System.out.println(sum);

        if (num == original) {
            System.out.println("Strong number");
        } else {
            System.out.println("not a strong number");
        }

    }
}
