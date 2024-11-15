import java.util.Scanner;
class PadovanSequence{
    public static int padovan(int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
        return padovan(n-2)+padovan(n-3);
        }
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<=n;i++){
		    System.out.print(padovan(i));
		    if(i<n){
		        System.out.print(" ");
		    }
		}
	}
}