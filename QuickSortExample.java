import java.util.Scanner;

class QuickSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); 
            
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; 
        int left = low + 1; 
        int right = high; 

        while (left <= right) {
            
            while (left <= right && arr[left] < pivot) {
                left++;
            }
            
            while (left <= right && arr[right] > pivot) {
                right--;
            }
            
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++; 
                right--; 
            }
        }
        
        arr[low] = arr[right];
        arr[right] = pivot;

        return right; 
    }
}

































/*import java.util.Scanner;

class QuickSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
			quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; 
        int i = high + 1; 

        for (int j = high; j > low; j--) {
            if (arr[j] >= pivot) {
                i--;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        
        int temp = arr[i - 1];
        arr[i - 1] = arr[low];
        arr[low] = temp;
        
        return i - 1; 
    }
}
*/