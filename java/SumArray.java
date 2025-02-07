import java.util.Scanner;

public class SumArray{
    public static void main(String[] args){
      Scanner Stdio = new Scanner(System.in);
      int [][] A;
      int [][] B;
      int [][] C;
      A = new int[2][2];
      B = new int[2][2];
      C = new int[2][2];
      
      for(int row = 0;row<A.length;row++){
        for(int col = 0;col<A[row].length;col++){
          A[row][col] = Stdio.nextInt();
        }
      }

      for(int row = 0;row<A.length;row++){
        for(int col = 0;col<A[row].length;col++){
          B[row][col] = Stdio.nextInt();
        }
      }

      for(int row = 0;row<A.length;row++){
        for(int col = 0;col<A[row].length;col++){
          C[row][col] = A[row][col] + B[row][col];
        }
      }
      System.out.println("A:");
      for(int row = 0;row<A.length;row++){
      for(int col = 0;col<A[row].length;col++){
          System.out.print(A[row][col]);
        }
        System.out.println();
      }
      System.out.println("B:");
      for(int row = 0;row<A.length;row++){
        for(int col = 0;col<A[row].length;col++){
          System.out.print(B[row][col]);
        }
        System.out.println();
      }
      System.out.println("C:A+B");
      for(int row = 0;row<A.length;row++){
        for(int col = 0;col<A[row].length;col++){
           System.out.print(C[row][col]);       
        }
        System.out.println();
      }

    }
}

