import java.util.*;
class SequentialSearch{
    public static int linearsearch(int[] array,int x){
        boolean istrue=true;
        int result=0;
        for(int i=0;i<array.length;i++){
            if(x==array[i]){
                istrue=false;
                result+=i;
            }
        }
        if(istrue){
            return -1;
        }
        else{
            return result;
        }
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String m=sc.nextLine();
		String[] inputA=sc.nextLine().split(" ");
		int [] array=new int[n];
		for(int i=0;i<n;i++){
		    array[i]=Integer.parseInt(inputA[i]);
		}
		int x=sc.nextInt();
		System.out.println(linearsearch(array,x));
	}
}