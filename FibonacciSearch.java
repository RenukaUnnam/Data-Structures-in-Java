import java.util.Scanner;
public class FibonacciSearch {
    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
    public static int fibonacciSearch(int[] arr, int x, int n) {
        int fibMMm2 = 0; 
        int fibMMm1 = 1;  
        int fibM = fibMMm2 + fibMMm1;  
        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }
        int offset = -1;
        while (fibM > 1) {
            int i = min(offset + fibMMm2, n - 1);
            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            }
            else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            }
            else {
                return i;
            }
        }
        if (fibMMm1 == 1 && arr[offset + 1] == x) {
            return offset + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int result = fibonacciSearch(arr, x, n);
        System.out.println(result);
        scanner.close();
    }
}