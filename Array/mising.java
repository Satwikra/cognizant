package Array;
import java.util.*;

public class mising {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int s = n + 1;

//         ArrayList<Integer> list = new ArrayList<>();

//         for (int num : arr) {
//             list.add(num);
//         }

//         for (int i = 1; i <= s; i++) {
//             if (!list.contains(i)) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

public static void main(String[] args){
    Scanner sc=new canner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    ArrayList<Integer>list=new ArrayList<>();

    for(int num:arr){
        list.add(num);
    }
    
}