public class RectangleArray {
    public static void main(String[] args) {
        int[][] rectangle = {{1, 2, 4}, {3, 4, 5},{1,4,6,7,8}}; // Corrected initialization

        int colLength = rectangle[0].length;
        System.out.println(colLength);
        boolean flag = true; // Corrected data type and spelling

        for (int i = 1; i < rectangle.length; i++) {
            if (rectangle[i].length != colLength) {
                flag = false;
                break; // Break early for efficiency
            }
        }

        System.out.println(flag); // Print the result instead of returning it
    }
}


