public class BinaryXor{
    public static String binaryXor(short value1, short value2){
      String binary1 ="";
      String binary2 ="";
      String result = "";
      for(int i = 0;i<16;i++){
        binary1 = (value1 & 1)+binary1;
        binary2 = (value2 & 1)+binary2;
        value1 = (short)(value1>>1);
        value2 = (short)(value2>>1);
      }
      for(int i = 0;i<16;i++){
        if(binary1.charAt(i) == binary2.charAt(i)){
          result = result + "0"; 
        }else{
          result = result + "1";  
        }
      }
      return result;
    }
    public static void main(String[] args){
      System.out.println(binaryXor((short)12,(short)15));
      System.out.println(binaryXor((short)142,(short)145));
      System.out.println(binaryXor((short)82,(short)255)); 
    }
}
