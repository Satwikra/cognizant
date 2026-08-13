package easy;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if(original==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
