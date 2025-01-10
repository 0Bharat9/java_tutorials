public class TextFeatures {
    public static void main(String[] args) {
        System.out.println("Please enter two integers, one double, one boolean, and one character, all on the same line:");
        System.out.println("For example: 42 17 3.14 true A");
        
        // Read multiple values from the same line of input
        int num1 = TextIO.getInt();       // Reads the first integer
        int num2 = TextIO.getInt();       // Reads the second integer
        double decimal = TextIO.getDouble(); // Reads the double value
        boolean flag = TextIO.getBoolean(); // Reads the boolean value
        char letter = TextIO.getChar();     // Reads the character value

        // Display the values to confirm correct reading
        System.out.println("You entered:");
        System.out.println("First integer: " + num1);
        System.out.println("Second integer: " + num2);
        System.out.println("Double: " + decimal);
        System.out.println("Boolean: " + flag);
        System.out.println("Character: " + letter);

        // Clear the input buffer to discard any leftover data
        TextIO.getln();

        // Example of reading a single word from the next input
        System.out.println("Now, please enter a single word:");
        String word = TextIO.getWord();
        System.out.println("You entered the word: " + word);
    }
}
