package Array;
import java.util.*;
public class roate {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=d;i<n;i++){
        list.add(arr[i]);
    }
    for(int i=0;i<d;i++){
        list.add(arr[i]);
    }
    for(int i=0;i<n;i++){
        arr[i]=list.get(i);
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+"");
    }

   } 
}
