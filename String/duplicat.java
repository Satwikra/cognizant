package String;
import java.util.*;

public class duplicat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        String str = sc.nextLine();

        // Boolean array to track visited characters
        boolean[] map = new boolean[26];

        // StringBuilder to store result
        StringBuilder newStr = new StringBuilder();

        // Remove duplicate characters
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            if (map[currChar - 'a'] == false) {
                map[currChar - 'a'] = true;
                newStr.append(currChar);
            }
        }

        // Output
        System.out.println(newStr);

        sc.close();
    }
}