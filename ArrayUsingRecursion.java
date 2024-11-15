import java.util.Scanner;
public class ArrayUsingRecursion {
    public static double recursiveSum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return recursiveSum(arr, n - 1) + arr[n - 1];
    }
    public static double findMean(int[] arr, int n) {
        double sum = recursiveSum(arr, n);
        return sum / n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double mean = findMean(arr, n);
        System.out.println(mean);
        sc.close();
    }
}