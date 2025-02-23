public class SudokuBoard {
    private static final int GRID_SIZE = 9;
    private int[][] board;

    public SudokuBoard() {
        this.board = new int[][]{
                {0, 9, 4, 0, 0, 3, 0, 7, 8},
                {7, 2, 0, 8, 0, 0, 0, 0, 6},
                {3, 1, 0, 0, 0, 0, 0, 0, 0},
                {8, 0, 0, 9, 1, 6, 5, 0, 7},
                {0, 0, 0, 5, 0, 2, 0, 0, 0},
                {9, 0, 6, 4, 8, 7, 0, 0, 3},
                {0, 0, 0, 0, 0, 0, 0, 2, 4},
                {2, 0, 0, 0, 0, 8, 0, 6, 5},
                {4, 6, 0, 7, 0, 0, 8, 0, 0}
        };
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean isValidMove(int row, int column, int number) {
        return !isNumberInRow(row, number) &&
                !isNumberInColumn(column, number) &&
                !isNumberInBox(row, column, number) &&
                board[row][column] == 0;
    }

    private boolean isNumberInRow(int row, int number) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInColumn(int column, int number) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberInBox(int row, int column, int number) {
        int startRow = row - row % 3;
        int startColumn = column - column % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean makeMove(int row, int column, int number) {
        if (isValidMove(row, column, number)) {
            board[row][column] = number;
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
