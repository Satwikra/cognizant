package String;
import java.util.*;

public class commonSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            set.add(ch);
        }

        for (char ch : s2.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println(ch);
            }
        }
    }
}






