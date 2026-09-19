package Array;

import java.util.*;
public class maxstock {
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int minPrice=s.charAt(0)-'0';
        int maxProfit=0;

        for(int i=1;i<n;i++){
            int price=s.charAt(i)-'0';
            
            maxProfit=Math.max(maxProfit,price-minPrice);
            minPrice=Math.min(minPrice,price);
        }
        System.out.println(maxProfit);
    }
}
}
