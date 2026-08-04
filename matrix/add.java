// package matrix;
// import java.util.*;
// public class add {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // Input size of matrix
//         int n = sc.nextInt();

//         int[][] a = new int[n][n];
//         int[][] b = new int[n][n];

//         // Input first matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }

//         // Input second matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 b[i][j] = sc.nextInt();
//             }
//         }

//         // Add matrices
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 a[i][j] = a[i][j] + b[i][j];
//             }
//         }

//         // Print resultant matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
//multiplple
package matrix;
import java.util.*;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Input size of matrix
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        // Input first matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Add matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] * b[i][j];
            }
        }

        // Print resultant matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}