import java.util.Scanner;

public class Task2{
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
    double f;
    System.out.print("Enter Fahrenheit: ");
    f = stdin.nextDouble();
    String result = temperatureConverter(f);
    System.out.println(result);
  }

  public static String temperatureConverter(double fahrenheit){
    double celcius = (fahrenheit - 32) * 5/9;
    //String formattedCelsius = String.format("%.2f", celsius);
    celcius = Math.round(celcius * 100.0) / 100.0;
    return "Fahrenheit (" + fahrenheit + ") is equivalent to Celcius (" + celcius +")";
  }
}


