package backtracking;

import java.util.Scanner;

public class findarr {
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Fill array
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // Backtracking effect
        for(int i = n - 1; i >= 0; i--) {
            arr[i] = arr[i] - 2;
        }

        // Print
        System.out.println("Final array:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
