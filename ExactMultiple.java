import java.util.Scanner;
 class ExactMultiple{
	public static int exactMultiple(int n1,int n2){
		if (n1==0||n2==0){
		    return 3;
		}
		else if(n1%n2==0){
		    return 2;
		}
		else
		    return 1;

	}
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    System.out.println(exactMultiple(num1,num2));
	}
}