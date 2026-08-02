package String;
import java.util.*;
class anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[]schar=s1.toCharArray();
        char[] tchar=s2.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        if(Arrays.equals(schar,tchar)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
sc.close();
    }
}