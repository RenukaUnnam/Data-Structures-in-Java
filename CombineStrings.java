import java.util.Scanner;
class CombineStrings{
    public static String combineString(String a,String b)
    {
        if(a.length() > b.length()){
            return b+a+b;
        }
            
        if(a.length() < b.length()){
            return a+b+a;
        }
        else{
           return a+b+a; 
        }
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String result = combineString(a,b);
		System.out.println(result);
	}
}