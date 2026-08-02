package String;
import java.util.*;
public class vowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        int v=0;
        int c=0;
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }else if(ch>='a'&& ch<='z'){
                c++;
            }
        }
        if(v>c){
            System.out.println("Yes");
        }else if(c>v){
            System.out.println("No");
        }else{
            System.out.println("Same");
        }

        }
}
