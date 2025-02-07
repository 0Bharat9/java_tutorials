public class BinaryRepresentation{
  public static String binaryRepresentation(short value){
    String binary = "";
    for(int i = 0;i<16;i++){
      binary = (value & 1) + binary;
      value = (short)(value >> 1);
    }
    return binary;
  }
  public static void main(String[] args){
    short value = 15;
    System.out.println(binaryRepresentation(value));
  }
}
