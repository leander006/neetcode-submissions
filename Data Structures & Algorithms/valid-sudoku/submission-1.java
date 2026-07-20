class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i =0 ;i<9;i++){
            for(int j =0;j<9;j++){
                int num =board[i][j];
                if(num != '.'){
                    if(!set.add(num+" row in " +i) || !set.add(num +" col in "+j) || !set.add(num+" row in "+i/3 +" col in "+j/3)){
                     return false;
                   }
                }
            }
        }
        return true;
    }
}
