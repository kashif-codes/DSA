class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int row = 0; // start from 0 row 
        int col = totalCols -1; // 5col -1 == 4th index

        while(row < totalRows && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;

        
    }
}