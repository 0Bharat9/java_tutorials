public class RoomDimension{
  private double length;
  private double width;

  public double getArea(){
    return length*width;
  }

  RoomDimension(double length, double width){
    this.length = length;
    this.width = width;
  }

  @Override
  public String toString(){
    return "Length: " + length + " Width: " + width;
  }

  public boolean equals(RoomDimension obj){
      return this.length == obj.length && this.width == obj.width;
  }

  public static void main(String[] args){
    RoomDimension room = new RoomDimension(1,10);
    Fan fan = new Fan();
    double area = room.getArea();
    System.out.println(area);
    System.out.println(room.toString());
    System.out.println(room.equals(new RoomDimension(1,10)));
    System.out.println(fan.isSuitable(area));
  }
} 
