import java.util.Random;

public class RandomNumberString {
    public static String stringOfRandomInt(int n, int x, int y) {
        Random rand  = new Random();
        String result = "";  // Using string concatenation instead of arrays or lists

        for (int i = 0; i < n; i++) {
            int randNum = rand.nextInt(y-x+1)+x;  // Generate random number in range [x, y]
            result += "<" + randNum + ">";  // Append formatted number to result
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringOfRandomInt(5, 5, 10));  // Example: <6><8><9><10><7>
        System.out.println(stringOfRandomInt(2, 2, 7));   // Example: <3><7>
        System.out.println(stringOfRandomInt(3, 1, 4));   // Example: <2><1><3>
    }
}
