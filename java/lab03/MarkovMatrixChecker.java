public class MarkovMatrixChecker {
    public static boolean isMarkovMatrix(double[][] m) {
        int N = m.length; // Matrix is square, so number of rows = number of columns

        // Check if each element is positive and sum of each column is 1
        for (int j = 0; j < N; j++) {
            double columnSum = 0.0;
            for (int i = 0; i < N; i++) {
                if (m[i][j] <= 0) { // Check if element is positive
                    return false;
                }
                columnSum += m[i][j];
            }
            if (Math.abs(columnSum - 1.0) > 1e-9) { // Check if column sum is 1 (with precision tolerance)
                return false;
            }
        }
        
        return true; // If all conditions are met, it's a Markov matrix
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {0.15, 0.875, 0.375},
            {0.55, 0.005, 0.225},
            {0.30, 0.12, 0.4}
        };

        System.out.println(isMarkovMatrix(matrix)); // Output: true
    }
}

