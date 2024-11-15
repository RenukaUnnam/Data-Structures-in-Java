import java.util.*;
public class EvenOrOdd {
     public static int count(int n1,int n2,int n3,int n4,int n5,String type){
        int arr[]={n1,n2,n3,n4,n5};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        if(type.equals("even")){
            return evencount;
        }
        else{
            return oddcount;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        String name=sc.next();
       
        System.out.println(count(n1, n2, n3, n4, n5, name));
    }
}