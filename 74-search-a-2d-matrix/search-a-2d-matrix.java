class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //row=mid /num of columns     col=mid % num of columns
       int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = n - 1;
        while (low < m && high >= 0) {
            if(matrix[low][high] == target)
            {
                return true;
            }
            else if(matrix[low][high] > target)
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        return false;
    }
}