import java.util.*;
public class Question2 {
    public static int addDigits(int input1) {
        int n = input1, sum;
        while(n / 10 > 0) {
            sum = 0;
            while(n > 0) {
                sum += (n % 10);
                n = n / 10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int result = addDigits(input1);
        System.out.println(result);
    }
}
