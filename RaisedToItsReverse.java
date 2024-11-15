import java.util.*;
class RaisedToItsReverse{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int R=sc.nextInt();
System.out.println(powerreverse(N,R));
}
public static long powerreverse(int N,int R){
   long base=1;
   long mod=1000000007;
   while(R!=0){
       base=(base*N)%mod;
       --R;
   }return base;
}
}