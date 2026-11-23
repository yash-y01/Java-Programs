package Day_01;
import java.util.Scanner;

public class Q_007 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        Boolean isPrime = true;

        for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
            if(num % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
