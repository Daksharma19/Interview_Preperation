import java.util.*;
public class Question4 {
    public static int maxPeople(int[] arr, int input2) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int total = 0;
        for(int i = 0;i<n;i++) {
            if(arr[i] + total <= input2) {
                total += arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int[] arr = new int[input1];
        for(int i = 0;i<input1;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxPeople(arr, input2));
    }
}
