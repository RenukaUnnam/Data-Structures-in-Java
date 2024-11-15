import java.util.*;
class UniformBinarySearch{
    public static int binarysearch(int [] arr,int X){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==X){
                return mid;
            }
            if(arr[mid]<X){
                low=mid+1;
            }
            if(arr[mid]>X){
                high=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String m=sc.nextLine();
		String [] input=sc.nextLine().split(" ");
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=Integer.parseInt(input[i]);
		}
		int X=sc.nextInt();
		System.out.println(binarysearch(arr,X));
	}
}