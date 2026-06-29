class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int st = 0, end = matrix[0].length-1;

            while(st <= end){
                int mid = st + (end - st)/2;
                if(matrix[i][mid] == target){
                    return true;
                }else if(matrix[i][mid] < target){
                    st = mid +1;
                }else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
