public class DigitCounter2 {
    public static int digitCountinString(String str) {
        int count = 0;
        for(int i =0;i<str.length();i++){
          if(str.charAt(i)>='0' && str.charAt(i)<='9'){
            count++;
          }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(digitCountinString("mystring123")); // Output: 3
        System.out.println(digitCountinString("123mystring123")); // Output: 6
        System.out.println(digitCountinString("123my25str047ing123")); // Output: 11
    }
}
