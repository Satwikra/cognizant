package Array;
import java.util.*;
class secondlarges{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int firstLargest=Integer.MIN_VALUE;
        int secondlargest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>firstLargest){
                secondlargest=firstLargest;
                firstLargest=arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=firstLargest){
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}