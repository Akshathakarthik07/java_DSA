package Graphs;
import java.util.LinkedList;
import java.util.Queue;
public class FloodFill {
        static class Pair{
            int row;
            int col;
            Pair(int r, int c){
                this.row = r;
                this.col = c;
            }
        }
    static Queue<Pair> q = new LinkedList<>();
    public static int[][] floodFill(int[][]image,int sr,int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (image[i][j] == image[sr][sc]) {
                    q.add(new Pair(i, j));

                    image[i][j] = color;
                    dfs(image, vis, color);

                }
            }
        }
        return image;
    }
        public static void dfs(int[][] image, int[][] vis,int color) {
            int n = image.length;
            int m = image[0].length;
            int[] drow = {-1, 0, +1, 0};
            int[] dcol = {0, 1, 0, -1};
            while (!q.isEmpty()) {
                int r = q.peek().row;
                int c = q.peek().col;
                q.remove();
                for (int a = 0; a < 4; a++) {
                    int nrow = r + drow[a];
                    int ncol = c + dcol[a];
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && image[nrow][ncol] == 1) {
                        q.add(new Pair(nrow, ncol));
                        image[nrow][ncol] = color;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
            int sr = 1;
            int sc = 1;
            int color = 2;
            int[][] ans = floodFill(image,sr,sc,color);
            for(int i=0;i<ans.length;i++){
                for (int j=0;j<ans.length;j++) {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

