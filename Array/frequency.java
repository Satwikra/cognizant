package Array;
import java.util.*;
public class frequency {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int nums:arr){
            if(!list.contains(nums)){
                list.add(nums);
            }
        }
            for(int nums:list){
                int count=0;
                for(int x:arr){
                    if(nums==x){
                    count++;
                }
            }
            System.out.println(nums+"->"+count);
        }
    }
}
