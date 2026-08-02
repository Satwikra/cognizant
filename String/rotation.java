package String;
import java.util.*;
public class rotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        StringBuilder sb=new StringBuilder(s1.length()*2);
        sb.append(s1).append(s1);

         System.out.println(sb.indexOf(s2)!=-1);

    }
}
