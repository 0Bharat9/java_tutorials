import java.util.Scanner;

public class Convert2d1d{
    public static void main(String[] args){
      Scanner Stdio = new Scanner(System.in);
      int n = Stdio.nextInt();
      int m = Stdio.nextInt();
      int [][] A;
      A = new int[n][m];
      for(int row = 0;row<A.length;row++){
        for(int col = 0;col<A[row].length;col++){
          A[row][col] = Stdio.nextInt();
        }
      }

      int [] values;
      values = new int[n*m]; 
      int k = 0;
      for(int row = 0;row<A.length;row++){
        for(int col = 0;col<A[row].length;col++){
          values[row*A[row].length + col] = A[row][col];
        }
      }
      System.out.println("A:");
      for(int row = 0;row<A.length;row++){
      for(int col = 0;col<A[row].length;col++){
          System.out.print(A[row][col]);
        }
        System.out.println();
      }
      for(int i=0;i<values.length;i++){
        System.out.println(values[i]);
      }
    }
}
 


