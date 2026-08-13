package String;
/**
 * countfreq
 */
import java.util.*;
public class countfreq {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(char ch:map.keySet()){
            System.out.println(ch+" = "+map.get(ch));
        }
    }
}

