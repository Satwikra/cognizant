package Array;
import java.util.*;
public class longestSequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int longest=0;
        for(int x:set){
            if(!set.contains(x-1)){
                int curr=x;
                while(set.contains(curr+1)){
                    curr++;
                }
                longest=Math.max(longest,curr-x+1);
            }
        }
        System.out.println(longest+"");
    }
}

