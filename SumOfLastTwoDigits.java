import java.util.Scanner;
class SumOfLastTwoDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = addLastDigits(Math.abs(num1), Math.abs(num2));
		System.out.println(result);
	}
	public static int addLastDigits(int num1, int num2)
	{
	    int L1 = num1 % 10;
	    int L2 = num2 % 10;
	    return L1 + L2;
	}
}