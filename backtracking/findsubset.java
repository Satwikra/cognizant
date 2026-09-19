package backtracking;
import java.util.*;


public class findsubset {

    static void subset(String str, String ans, int i) {

        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Take
        subset(str, ans + str.charAt(i), i + 1);

        // Don't take
        subset(str, ans, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        subset(str, "", 0);
    }
}