import java.util.Scanner;
public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) return low;
                return -1;
            }
            int pos = low + ((x - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            if (arr[pos] == x) return pos;
            if (arr[pos] < x) low = pos + 1;
            else high = pos - 1;
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
        int target = scanner.nextInt();
        int index = interpolationSearch(arr, n, target);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("-1");
        }
        scanner.close();
    }
}