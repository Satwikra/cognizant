package Array;
import java.util.*;
public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String name=sc.nextLine();
        int rollNo=sc.nextInt();
        int marks[]=new int[5];
        int sum=0;

        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
            sum+=marks[i];
            
        }
    }
}
