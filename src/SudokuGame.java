import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;
    private Scanner scanner;
    private static int iterations = 0;
    private static int guesses = 0;

    public SudokuGame() {
        this.board = new SudokuBoard();
        this.scanner = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Witaj w grze Sudoku!");
        System.out.println("Wprowadź ruch w formacie: wiersz, kolumna, liczba.");
        System.out.println("Jeśli chcesz zakończyć grę i rozwiązać Sudoku, wpisz 'SUDOKU' w każdej chwili.");

        while (true) {
            board.printBoard();


            System.out.println("\nJeśli chcesz zakończyć grę i rozwiązać Sudoku, wpisz 'SUDOKU'.");
            String nextInput = scanner.nextLine().trim();

            if (nextInput.equalsIgnoreCase("SUDOKU")) {
                if (solveBoard()) {
                    System.out.println("\nGratulacje! Sudoku rozwiązane!");
                    board.printBoard();
                    System.out.println("Liczba iteracji: " + iterations);
                    System.out.println("Liczba zgadywań: " + guesses);
                    System.out.println("Ocena trudności: " + getDifficulty());
                } else {
                    System.out.println("\nNie udało się rozwiązać Sudoku.");
                }
                break;
            }

            try {
                int[] move = InputHandler.getPlayerMove(nextInput);
                int row = move[0];
                int column = move[1];
                int number = move[2];


                if (board.makeMove(row, column, number)) {
                    System.out.println("Ruch wykonany!");
                } else {
                    System.out.println("Ruch niepoprawny! Spróbuj ponownie.");
                }
            } catch (Exception e) {
                System.out.println("Błąd! Spróbuj ponownie.");
            }

        }
    }

    private boolean solveBoard() {
        int[][] grid = board.getBoard();
        return solve(grid);
    }

    private boolean solve(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        iterations++;

                        if (board.isValidMove(row, col, num)) {
                            grid[row][col] = num;

                            if (solve(grid)) {
                                return true;
                            } else {
                                grid[row][col] = 0;
                                guesses++;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private String getDifficulty() {

        if (guesses < 500) {
            return "Łatwe";
        } else if (guesses < 1000 ) {
            return "Średnie";
        } else if (guesses < 5000) {
            return "Trudne";
        } else {
            return "Bardzo trudne";
        }
    }
}
