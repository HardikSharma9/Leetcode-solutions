class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstrow = false;
        boolean firstcol = false;

        // Check if first row has any 0
        for (int col = 0; col < m; col++) {
            if (matrix[0][col] == 0) {
                firstrow = true;
                break;
            }
        }

        // Check if first column has any 0
        for (int row = 0; row < n; row++) {
            if (matrix[row][0] == 0) {
                firstcol = true;
                break;
            }
        }

        // Use first row and column as markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set elements to 0 based on markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Handle first row and column separately
        if (firstrow) {
            for (int col = 0; col < m; col++) {
                matrix[0][col] = 0;
            }
        }
        if (firstcol) {
            for (int row = 0; row < n; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}