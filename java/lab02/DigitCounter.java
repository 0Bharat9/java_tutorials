public class DigitCounter {
    public static int digitCountinString(String str) {
        int count = 0;
        int i = 0;
        try {
            while (true) { 
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                }
                i++; // Move to the next character
            }
        } catch (IndexOutOfBoundsException e) {
            // When we go beyond the string length, the loop stops
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(digitCountinString("mystring123")); // Output: 3
        System.out.println(digitCountinString("123mystring123")); // Output: 6
        System.out.println(digitCountinString("123my25str047ing123")); // Output: 11
    }
}

