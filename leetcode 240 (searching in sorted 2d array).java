class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int  m = matrix.length;
     int n = matrix[0].length;
     int i =0;
     int j = matrix[0].length-1;
     while(j>=0 && i<m){
    if(target > matrix[i][j])
    i++;
    else if(target < matrix[i][j])
    j--;
    else if(target==matrix[i][j])
    return true;
    }
    return false;
    }
}