// 36. Valid Sudoku

class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for(int i =0;i<9;i++){
            for(int j = 0; j<9; j++){
                char currentVal = board [i][j];

                if (currentVal != '.'){
                    String row = currentVal + "in row" + i;
                    String column = currentVal + "in column" + j;
                    String box = currentVal + "in box" + (i/3) + "-" + (j/3);


                    if(!seen.add(row) || !seen.add(column) || !seen.add(box)){
                        return false;
                    }

                }

            }
        }
        return true;   
        
    }
}
