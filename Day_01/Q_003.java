package Day_01;
import java.util.Scanner;

public class Q_003 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while(temp > 0) {

            int digit = temp % 10;
           // System.out.println(digit);
            rev = (rev * 10) + digit;
          //  System.out.println(rev);
            temp = temp / 10;
          //  System.out.println(temp);
          
        }

        System.out.println("reverse : " + rev);
        System.out.println("original :" + num);


    }
}
