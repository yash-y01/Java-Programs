import java.util.Scanner;

public class Q_004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while (temp > 0) {

            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;

        }

        System.out.println("reverse : " + rev);
        System.out.println("original :" + num);

        if (rev == num) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
