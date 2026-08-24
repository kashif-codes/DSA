class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;
        
        // total number of elements
        int n = totalRows * totalCols;

        //1D array
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start +(end-start)/2;

            int rowIndex = mid/totalCols;
            int colIndex = mid % totalCols;

            if(matrix[rowIndex][colIndex] == target){
                return true;
            }
            else if(matrix[rowIndex][colIndex] > target){
                //left
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}