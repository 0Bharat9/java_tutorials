public class DistanceCalculator {
    public static double[][] findDistances(double[][] m) {
        int n = m.length; // Number of points
        double[][] distances = new double[n][n];
        // Calculate distances using Euclidean distance formula
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    distances[i][j] = 0.0; // Distance to itself is 0
                } else {
                    double dx = m[i][0] - m[j][0]; // Difference in x-coordinates
                    double dy = m[i][1] - m[j][1]; // Difference in y-coordinates
                    distances[i][j] = Math.sqrt(dx * dx + dy * dy); // Euclidean distance formula
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        double[][] coordinates = {
            {1.0, 2.0},
            {3.0, 2.0},
            {4.0, 5.0}
        };

        double[][] result = findDistances(coordinates);

        // Display the result
        for (double[] row : result) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
}

