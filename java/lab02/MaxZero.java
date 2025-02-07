public class MaxZero{
  public static int lengthofMaxConsecutiveZeros(String str){
    int count = 0;
    int maxCount = 0;
    for(int i =0;i<str.length();i++){
      if(str.charAt(i) == '0'){
        count++;
      } else{
        maxCount=Math.max(count,maxCount);
        count = 0;
      }
    }
    return maxCount;
  }

  public static void main(String[] args){
    String str1= "11101110001";
    String str2= "10000001001";
    String str3= "0000100111";
    String str4= "01001010100111";
    System.out.println("Max Consecutive Zeros in String 1: "+lengthofMaxConsecutiveZeros(str1));
    System.out.println("Max Consecutive Zeros in String 2: "+lengthofMaxConsecutiveZeros(str2));
    System.out.println("Max Consecutive Zeros in String 3: "+lengthofMaxConsecutiveZeros(str3));
    System.out.println("Max Consecutive Zeros in String 4: "+lengthofMaxConsecutiveZeros(str4));
  }
}
