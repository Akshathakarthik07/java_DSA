package DyanamicProgramming;

public class MazePath {
    public static int path(int n, int row, int col) {
        if (row == n && col == n) {
            return 1;
        }
        if (row > n || col > n) {
            return 0;
        }
        int right = path(n, row, col + 1);
        int down = path(n, row + 1, col);

        return right + down;
    }

    public static void main(String[] args) {
        int n = 2;
        int ans = path(n, 0, 0);
        System.out.println(ans);
    }
}

