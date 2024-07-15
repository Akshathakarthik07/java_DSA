package Graphs;
public class NoofIslandUsingDFS {public static int numberOfIsland(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;

    boolean[][] vis = new boolean[n][m];
    int cnt = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == 1 && !vis[i][j]) {
                cnt++;
                dfs(i, j, grid, vis);
            }
        }
    }
    return cnt;
}

    public static void dfs(int row, int col, int[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        vis[row][col] = true;

        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, +1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol] && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, grid, vis);
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,1,0},{0,1,1,0},{0,0,1,0},{0,0,0,0},{1,1,0,1}};
        int ans = numberOfIsland(grid);
        System.out.println(ans);
    }
}

