import java.util.Scanner;
class SecondLastDigit{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    int result = getSecondLastDigit(number);
	    System.out.println(result);
 }
	 public static int getSecondLastDigit(int number)
	 {
	    number = Math.abs(number);
	    if(number < 10)
	    {
	        return -1;
	    }
	    else
	    {
	        return(number/10)%10;
	    }
	 }
}