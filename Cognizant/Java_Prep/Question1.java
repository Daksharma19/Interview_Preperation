import java.util.*;
public class Question1 {
    public int[] doubleArray(int[] input1, int input2) {
        int res[] = new int[input2 * 2];    
        for(int i = 0;i<input2;i++) {
            res[i] = input1[i];
            res[i+input2] = input1[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Question1 q = new Question1();
        int result[] = q.doubleArray(arr, n);
        for(int i = 0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
