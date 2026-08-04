package matrix;
import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];

        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int key=sc.nextInt();
        boolean found=false;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found at  cell ("+i+","+j+")");
                found=true;
                }
            }
        }
    }
}
