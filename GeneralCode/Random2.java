package GeneralCode;
import java.util.LinkedList;
import java.util.Queue;
public class Random2 {
        static class Pair {
            int row;
            int col;

            Pair(int r, int c) {
                this.row = r;
                this.col = c;
            }
        }

        public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int n = image.length;
            int m = image[0].length;

            if (image[sr][sc] == color) {
                return image; // No need to change if the new color is the same as the old color.
            }

            int initialColor = image[sr][sc];
            dfs(image, sr, sc, initialColor, color);

            return image;
        }

        public static void dfs(int[][] image, int row, int col, int initialColor, int newColor) {
            int n = image.length;
            int m = image[0].length;

            if (row < 0 || row >= n || col < 0 || col >= m || image[row][col] != initialColor) {
                return;
            }

            image[row][col] = newColor;

            int[] drow = {-1, 0, +1, 0};
            int[] dcol = {0, +1, 0, -1};

            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                dfs(image, nrow, ncol, initialColor, newColor);
            }
        }

        public static void main(String[] args) {
            int[][] image = {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {1, 1, 0, 1}};
            int sr = 1;
            int sc = 1;
            int color = 2;
            int[][] ans = floodFill(image, sr, sc, color);

            for (int[] row : ans) {
                for (int pixel : row) {
                    System.out.print(pixel + " ");
                }
                System.out.println();
            }
        }
    }


