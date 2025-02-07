import java.util.Scanner;

public class Task1{
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);

    int m;
    int d;
    System.out.print("Enter month: ");
    m = stdin.nextInt();
    System.out.print("Enter day: ");
    d = stdin.nextInt();
    String weather = weather(m, d);
    System.out.println("The weather is: " + weather);
  }

  public static String weather(int month, int day){
    if(month == 12 && day >=15){
      return "Winter";
    }

    if(month >=1 && month <=3){
      if(month == 3 && day >25){
        return "Unknown"; 
      } else{
      return "Winter";
      }
    }

    if(month >=4 && month <=5){
      return "Spring";
    }

    if(month >=6 && month <=9){
      if(month ==9 && day >15){
        return "Fall"; 
      }else{
        return "Summer"; 
      }
    }

    if(month >=9 && month <=11){
      return "Fall";  
    }
    return "Unknown";
  }
}
