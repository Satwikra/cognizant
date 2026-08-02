package Array;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number[]=new int[n];
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            first++;
            last--;
        }
        for(int i=0;i<n;i++){
            System.out.println(number[i]+"");
        }
    }
}
