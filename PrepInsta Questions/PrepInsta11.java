import java.util.*;
public class PrepInsta11 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        rev = rev * sign;

        System.out.println("Reversed: " + rev);
    }
}
