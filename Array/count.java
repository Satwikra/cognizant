package Array;
import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        for(int num:arr){
            if(num==target){
                set.add(num);
                count++;
            }
        }
        System.out.println(count);
    }
}
