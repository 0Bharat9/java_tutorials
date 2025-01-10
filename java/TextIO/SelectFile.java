public class SelectFile {
    public static void main(String[] args) {
        // Prompt user for the file to write to
        System.out.println("Select a file to write to:");
        TextIO.writeUserSelectedFile();

        // Ask the user for input text
        System.out.println("Enter text to write to the file (type 'exit' to finish):");

        while (true) {
            String input = TextIO.getln(); // Read user input
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Writing completed. Exiting...");
                break;
            }
            TextIO.putln(input); // Write the input to the selected file
        }

        // Close the file
        TextIO.writeStandardOutput();
        System.out.println("File writing complete.");
    }
}

