package String;
import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder(str);
        String reverseresult=sb.reverse().toString();

        System.out.println(reverseresult);
    }
}
