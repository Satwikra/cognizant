package matrix;
import  java.util.*;
public class maxwealth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Create 2D array
        int[][] accounts = new int[m][n];

        // Input account balances
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        // Find maximum wealth
        int maxWealth = 0;

        for (int i = 0; i < m; i++) {

            int currentWealth = 0;

            for (int j = 0; j < n; j++) {
                currentWealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, currentWealth);
        }

        // Print result
        System.out.println(maxWealth);

        sc.close();
    }
}