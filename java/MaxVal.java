import java.util.Scanner;

public class MaxVal{
    public static void main(String[] args){
      Scanner Stdio = new Scanner(System.in);
      double [] values;
      values = new double[10];
      for(int i =0;i<values.length;i++){
        System.out.println(values[i]);
      }
      for(int i = 0;i<values.length;i++){
       values[i] = Stdio.nextDouble();
      }
      double max = values[0];
      for(int i = 1;i<values.length;i++){
        if(values[i]>max){
          max = values[i];
        }
      }
      System.out.println(max);
    }
}
