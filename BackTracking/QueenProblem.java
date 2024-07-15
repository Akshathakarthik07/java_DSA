package BackTracking;

public class QueenProblem {
        public static void queenCombination(boolean[] board, int col, int qpsf, int tq, String ans) {
            if (qpsf == tq) {
                System.out.println(ans);
                return;
            }
            if (col == board.length) {
                return;
            }
            if (!board[col]) {
                board[col] = true;
                queenCombination(board, col + 1, qpsf + 1, tq, ans + "B" + col);
                board[col] = false;
            }
            queenCombination(board, col + 1, qpsf, tq, ans);
        }

        public static void main(String[] args) {

            queenCombination(new boolean[4], 0, 0, 2, "");
        }
    }


