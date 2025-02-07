public class BinaryRepresentation2{
  public static String binaryRepresentation(short value){
    String binary = "";
    for(int i = 0;i<16;i++){
      binary = value%2 + binary;
      value /= 2;
    }
    return binary;
  }
  public static void main(String[] args){
    System.out.println(binaryRepresentation((short)15));
    System.out.println(binaryRepresentation((short)145));
    System.out.println(binaryRepresentation((short)255));
  }
}

