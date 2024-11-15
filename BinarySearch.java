import java.util.*;
class BinarySearch{
    public static int bSearch(int X, int[] array)
    {
        int low = 0;
        int high = array.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(array[mid]==X)
                return mid;
            if(array[mid]<X)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++)
		{
            array[i] = sc.nextInt();
        }
	    int X = sc.nextInt();
	    int result = bSearch(X, array);
	    System.out.print(result);

	}
}