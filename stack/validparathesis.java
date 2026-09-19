package stack;

import java.util.*;
public class validparathesis {

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Stack<Character> s = new Stack<>();

        boolean valid = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {

                s.push(ch);

            } else {

                // No opening bracket available
                if (s.isEmpty()) {
                    valid = false;
                    break;
                }

                // Check matching bracket
                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '{' && ch == '}') ||
                    (s.peek() == '[' && ch == ']')) {

                    s.pop();

                } else {

                    valid = false;
                    break;
                }
            }
        }

        // Stack should be empty
        if (!s.isEmpty()) {
            valid = false;
        }

        System.out.println(valid);
    }
}
}
