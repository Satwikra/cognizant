package sorting;
import java.util.*;
public class selection {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int maxIndex=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[maxIndex]){
            maxIndex=j;
        }
    }
    int temp=arr[i];
    arr[i]=arr[maxIndex];
    arr[maxIndex]=temp;
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+"");
    }
 }   
}
