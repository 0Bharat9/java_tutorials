public class MultipleCounter {
    public static String countofMult357(int lowerLimit, int upperLimit) {
        // Error handling if lower limit is greater than upper limit
        if (lowerLimit > upperLimit) {
            return "Error: lower limit (" + lowerLimit + ") is not less than or equal to upper limit (" + upperLimit + ")";
        }

        int count3 = 0, count5 = 0, count7 = 0;

        // Loop from lowerLimit to upperLimit (inclusive)
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (i % 3 == 0) count3++;
            if (i % 5 == 0) count5++;
            if (i % 7 == 0) count7++;
        }

        // Construct the required output string
        return "Between (" + lowerLimit + ") and (" + upperLimit + ") there are (" +
               count3 + ") multiple of 3, (" +
               count5 + ") multiple of 5 and (" +
               count7 + ") multiple of 7";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countofMult357(0, 5));
        System.out.println(countofMult357(10, 10));
        System.out.println(countofMult357(10, 22));
        System.out.println(countofMult357(7, 5)); // Should return an error message
    }
}

