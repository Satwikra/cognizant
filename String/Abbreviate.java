package String;
import java.util.*;

public class Abbreviate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int len=word.length();

        if(len<=2){
            System.out.println(word);
        }else{
            System.out.println(
                word.charAt(0)+
                String.valueOf(len-2)+
                word.charAt(len-1)
            );
        }
    }
}