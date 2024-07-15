package Graphs;
import java.util.*;
public class XO {
        public static class Pair {
            int row;
            int col;

            Pair(int r, int c) {
                this.row = r;
                this.col = c;
            }
        }

        static Queue<Pair> q = new LinkedList<>();

        public static char[][] xoChange(char[][] grid, int n, int m) {
            for (int i = 1; i < n-1 ; i++) {
                for (int j = 1; j < m-1 ; j++) {
                    if (grid[i][j] == 'O') {
                        grid[i][j] = 'X';
                        q.add(new Pair(i, j));
                        dfs(grid, n, m);
                    }
                }
            }
            return grid;
        }

        public static void dfs(char[][] grid, int n, int m) {
            int[] drow = {-1, 0, 1, 0};
            int[] dcol = {0, 1, 0, -1};

            while (!q.isEmpty()) {
                Pair p = q.remove();
                int r = p.row;
                int c = p.col;

                for (int i = 0; i < 4; i++) {
                    int nrow = r + drow[i];
                    int ncol = c + dcol[i];
                    if (nrow >= 0 && nrow < n-1&& ncol >= 0 && ncol < m-1 && grid[nrow][ncol] == 'O') {
                        q.add(new Pair(nrow, ncol));
                        grid[nrow][ncol] = 'X';
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String str = sc.nextLine();
                String[] s=str.split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = s[j].charAt(0);
                }
            }

            char[][] result = xoChange(grid, n, m);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


