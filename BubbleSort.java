import java.util.*;
public class BubbleSort{
    static void bubblesort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String m=sc.nextLine();
        String [] input=sc.nextLine().split(" ");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        
        bubblesort(arr);
        printarray(arr);
        
    }
}