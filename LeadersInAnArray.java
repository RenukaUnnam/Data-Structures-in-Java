import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class LeadersInAnArray{
    public static List<Integer> findArrayLeaders(int[] arr){
        ArrayList<Integer> array=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            boolean istrue=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                       istrue=false;
                }
                
            }
            if(istrue){
                array.add(arr[i]);
            }
        }
        return array;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String input=sc.nextLine();
        String [] inputA=sc.nextLine().split(", ");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(inputA[i]);
        }
        List<Integer> array=findArrayLeaders(arr);
        for(int item: array){
            System.out.print(item+" ");
        }
      
    }
}