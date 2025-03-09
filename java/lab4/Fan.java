public class Fan{
  public static final int Slow=1;
  public static final int Mediym=2;
  public static final int Fast=3;

  public static final boolean On=true;
  public static final boolean Off=false;

  private int speed;
  private boolean status;
  private double radius;
  private String color;


  public double getCoverage(){
    return speed*radius*5;
  }

  public boolean isSuitable(double area){
    return Slow*radius*5 >= 2*area && Fast*radius*5 <= 10*area;
  }
  
  Fan(){
    speed = Slow;
    status = Off;
    radius = 5;
    color = "blue";
  }

  Fan(int speed, boolean status, double radius, String color){
    this.speed = speed;
    this.status = status;
    this.radius = radius;
    this.color = color;
  }

  @Override
  public String toString(){
    if(status){
      return "(Speed: "+speed+", Color: "+color+", Radius: "+radius+")";
    }
    else{
      return "(fan is off, Color: "+color+", Radius: "+radius+")";
    }
  }

  public static void main(String[] args){
    Fan fan1 = new Fan();
    String condition = fan1.isSuitable(50)?"Suitable":"Not Suitable";
    condition += " with status " + fan1.toString();
    System.out.println("Fan1 is "+condition+" for the area of 10");
    Fan fan2 = new Fan(Fast, On, 10, "red");
    condition = fan2.isSuitable(10)?"Suitable":"Not Suitable";
    condition += " with status " + fan2.toString();
    System.out.println("Fan2 is "+condition+" for the area of 10");
  }
}
