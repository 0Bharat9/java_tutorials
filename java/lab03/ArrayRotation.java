import java.util.Arrays;

public class ArrayRotation {
    public static String rotateArray(int[][] originalArray) {
        // Check if the array is null
        if (originalArray == null) {
            return "[null array]";
        }

        int N = originalArray.length;
        
        // Check if the array is square
        for (int i = 0;i<N;i++) {
            if (originalArray[i].length != N) {
                return "[not a square array]";
            }
        }

        // Create a new array to store the rotated result
        int[][] rotatedArray = new int[N][N];

        // Perform the 90-degree clockwise rotation
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotatedArray[j][N - 1 - i] = originalArray[i][j];
            }
        }

        // Convert the rotated array to the required string format
        return Arrays.deepToString(rotatedArray);
    }

    public static void main(String[] args) {
        int[][] testArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println(rotateArray(testArray)); // Output: {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}
    }
}

