package stack;

import java.util.*;
public class bottomtotop {

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> s = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            s.push(value);
        }

        int data = sc.nextInt();

        Stack<Integer> temp = new Stack<>();

        // Move s to temp
        while (!s.isEmpty()) {
            int value = s.pop();
            temp.push(value);
        }

        // Add data at bottom
        s.push(data);

        // Move temp back to s
        while (!temp.isEmpty()) {
            int value = temp.pop();
            s.push(value);
        }

        // Print stack
        while (!s.isEmpty()) {
            int value = s.pop();
            System.out.println(value);
        }
    }
}
}
