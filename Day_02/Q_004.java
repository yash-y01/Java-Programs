package Day_02;

import java.util.Scanner;

public class Q_004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 1;

        while (num >= count) {
            System.out.println(a + " ");

            int c = a + b;
            a = b;
            b = c;

            count++;
        }
    }
}


