import java.util.*;
public class AlternateStringCombiner{
    public  String combineStrings(String a,String b){
        String result="";
        int lena=a.length();
        int lenb=b.length();
        int min=Math.min(lena, lenb);
        for(int i=0;i<min;i++){
            result+=a.charAt(i);
            result+=b.charAt(i);
        }
        if(lena>lenb){
            result+=a.substring(lenb);
        }
        else{
            result+=b.substring(lena);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String arr[]=n.split(",");
        String a=arr[0];
        String b=arr[1];
        AlternateStringCombiner obj=new AlternateStringCombiner();
        System.out.println(obj.combineStrings(a, b));
    }
}