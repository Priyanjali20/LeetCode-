class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int m = matrix.length;
     int n= matrix[0].length;
     int l=0;
     int h=m*n-1;
     while(l<=h){
     int mid = (l+h)/2;
     int i =mid/n;
     int j = mid%n;
     if(target < matrix[i][j])
     h = mid-1;
     else if(target > matrix[i][j]){
     l = mid+1;
     }
     else 
     return true;
     }
     return false;
}
}