class Solution {
    int max = 0;
    boolean[][] visited = null;
    int rows = -1;
    int cols = -1;
    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        int count = 0;

        for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    getIsland(grid, i , j);
                    count++;
                }
            
        }
        }
        return max;
    }


    public void getIsland(int[][] grid, int i , int j) {
        Queue<int[]> que = new LinkedList<>();
        int[][] dir = new int[][]{ {-1,0}, {1, 0} , {0, -1}, {0, 1}};

        que.add(new int[]{i,j});
        int count = 0;

        while (!que.isEmpty()) {
            count++;
            int[] jy = que.remove();
            int x = jy[0];
            int y = jy[1];
            visited[x][y] = true;

            for (int g= 0 ; g < dir.length; g++) {
                int[] arr = dir[g];
                int x1 = x + arr[0];
                int y1 = y + arr[1];
                if (checkDirections(x1, y1) && grid[x1][y1] == 1 && !visited[x1][y1]) {
                    que.add(new int[]{x1,y1});
                    visited[x1][y1] = true;
                }
            }
        }
        max = Math.max(max, count);
    }

    boolean checkDirections(int x, int y) {
       if (x >= 0 && x < rows && y >= 0 && y < cols) {
        return true;
       }
       return false;
    }
}
