class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows = 9;
        int cols = 9;
        for (int i = 0; i < rows; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == '.')
                    continue;
                if (seen.contains(board[i][j]))
                    return false;
                seen.add(board[i][j]);
            }
            // System.out.println(seen);
        }

        for (int i = 0; i < cols; i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < rows; j++) {
                if (board[j][i] == '.')
                    continue;
                if (seen.contains(board[j][i]))
                    return false;
                seen.add(board[j][i]);
            }
          //  System.out.println(seen);
        }

        for (int square = 0; square < 9; square++) {
            HashSet<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = (square / 3) * 3 + i;
                    int c = (square % 3) * 3 + j;
                    if (board[r][c] == '.')
                        continue;
                    if (seen.contains(board[r][c]))
                        return false;
                    seen.add(board[r][c]);
                }
                
            }
           
        }
        return true;
    }
}
