package Array;

import java.util.*;
public class sumofadjacent {
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prev1=0;
        int prev2=0;
        for(int i=0;i<n;i++){
            int take=arr[i]+prev2;
            int skip=prev1;

            int current=Math.max(take,skip);

            prev2=prev1;
            prev1=current;
        }
        System.out.println(prev1);
        }
}
}