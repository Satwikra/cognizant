package stack;

import java.util.*;
public class duplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack<Character> s = new Stack<>();

        boolean duplicate = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ')') {

                int count = 0;

                // Pop until '('
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // Duplicate parentheses
                if (count < 1) {
                    duplicate = true;
                    break;
                }

                // Remove '('
                s.pop();

            } else {

                // Push all other characters
                s.push(ch);
            }
        }

        System.out.println(duplicate);
    }
}