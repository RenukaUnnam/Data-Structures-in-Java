import java.util.ArrayList;
import java.util.List;

public class RadixSortExp {
	
	public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original Array: ");
        printArray(arr);

        radixSort(arr); 

        System.out.println("Sorted Array: ");
        printArray(arr);
    }

    public static void radixSort(int[] arr) {
        int maxNumber = getMax(arr); 
        int maxDigits = getDigits(maxNumber); 

        int placeValue = 1; 
        while (maxDigits-- > 0) {
            countingSort(arr, placeValue);
            placeValue *= 10; 
		}
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getDigits(int num) {
        return (int) Math.log10(num) + 1;
    }

    private static void countingSort(int[] arr, int placeValue) {
        int n = arr.length;
        int[] output = new int[n]; 
        int[] count = new int[10]; 
		
        for (int num : arr) {
            int digit = (num / placeValue) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / placeValue) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
