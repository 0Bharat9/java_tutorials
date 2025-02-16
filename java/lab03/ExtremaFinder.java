public class ExtremaFinder {
    public static String findExtrema(int[][] array) {
        if (array == null) {
            return "[null array]";
        }
        
        int rows = array.length;
        int cols = array[0].length;
        
        int[] rowMax = new int[rows];
        int[] rowMin = new int[rows];
        int[] colMax = new int[cols];
        int[] colMin = new int[cols];
        
        for (int i = 0; i < cols; i++) {
            colMax[i] = Integer.MIN_VALUE;
            colMin[i] = Integer.MAX_VALUE;
            rowMax[i] = Integer.MIN_VALUE;
            rowMin[i] = Integer.MAX_VALUE;
        }
        
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) {
                rowMax[i] = Math.max(rowMax[i], array[i][j]);
                System.out.println(arrayToString(rowMax));
                rowMin[i] = Math.min(rowMin[i], array[i][j]);
                System.out.println(arrayToString(rowMin));
                colMax[j] = Math.max(colMax[j], array[i][j]);
                System.out.println(arrayToString(colMax));
                colMin[j] = Math.min(colMin[j], array[i][j]);
                System.out.println(arrayToString(colMin));
            }
        }
        
        return "The maximum values along the rows are " + arrayToString(rowMax) + ".\n"
             + "The minimum values along the rows are " + arrayToString(rowMin) + ".\n"
             + "The maximum values along the columns are " + arrayToString(colMax) + ".\n"
             + "The minimum values along the columns are " + arrayToString(colMin) + ".";
    }
    
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        int[][] array = {
            {4, 10, 21},
            {20, 21, 300},
            {71, 0, 10}
        };
        
        System.out.println(findExtrema(array));
    }
}

