package Day_02;

import java.util.Scanner;

public class Q_006 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base number : ");
        int base = sc.nextInt();

        System.out.print("Enter a Exponent number : ");
        int Exponent  = sc.nextInt();

        int power = base;

        for(int i = 1 ; i < Exponent ; i++) {
            power = power * base;
        }

        System.out.println(power);

    }
}
