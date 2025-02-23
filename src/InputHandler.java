import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] getPlayerMove(String nextInput) {
        int row, column, number;
        while (true) {
            try {
                System.out.print("Podaj wiersz (1-9): ");
                row = scanner.nextInt() - 1; // Przekształcamy na indeks od 0
                System.out.print("Podaj kolumnę (1-9): ");
                column = scanner.nextInt() - 1; // Przekształcamy na indeks od 0
                System.out.print("Podaj cyfrę (1-9): ");
                number = scanner.nextInt();

                if (row < 0 || row >= 9 || column < 0 || column >= 9 || number < 1 || number > 9) {
                    System.out.println("Nieprawidłowy zakres. Wiersz i kolumna muszą być w zakresie 1-9, a cyfra 1-9.");
                    continue;
                }

                return new int[]{row, column, number};
            } catch (Exception e) {
                System.out.println("Błąd! Wprowadź liczby całkowite.");
                scanner.next(); // clean the buffer
            }
        }
    }
}
