class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] rowZero = new int[m];
        int[] colZero = new int[n];
        
        // 1. Identify rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = 1;
                    colZero[j] = 1;
                }
            }
        }
        
        // 2. Zero out the identified rows
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
              if (rowZero[i]==1 || colZero[j]==1) {
                    matrix[i][j] = 0;
                
            }
            }     
        }
        
        
    }
}