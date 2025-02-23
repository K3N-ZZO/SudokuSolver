# Gra w Sudoku

## Opis
Gra w Sudoku napisana w języku Java. Gra pozwala użytkownikowi na interaktywną grę w Sudoku, w której może wprowadzać ruchy (wiersz, kolumna, liczba). Użytkownik ma możliwość rozwiązania całego Sudoku w dowolnym momencie, wpisując komendę `SUDOKU`. Po rozwiązaniu Sudoku, program wyświetla ocenę trudności w oparciu o liczbę iteracji i zgadywań wykonanych podczas rozwiązywania układanki.

## Funkcje:
- **Interaktywna gra**: Gracz może wykonywać ruchy w formacie: `wiersz, kolumna, liczba`.
- **Automatyczne rozwiązanie**: Gracz może wpisać `SUDOKU`, aby natychmiast rozwiązać Sudoku.
- **Ocena trudności**: Po rozwiązaniu Sudoku, program wyświetla liczbę iteracji oraz liczbę zgadywań, a także ocenia trudność Sudoku jako "Łatwe", "Średnie", "Trudne" lub "Bardzo trudne".

## Jak zainstalować i uruchomić:

1. **Pobierz repozytorium**:
    ```
    git clone https://github.com/<twoje_uzytkownik>/SudokuSolver.git
    ```

2. **Zainstaluj JDK**:
   Gra jest napisana w Javie, więc potrzebujesz zainstalowanego JDK (Java Development Kit) na swoim komputerze. Upewnij się, że masz wersję JDK 8 lub wyższą. Możesz pobrać JDK [tutaj](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

3. **Skonfiguruj projekt**:
   Przejdź do folderu projektu:

cd SudokuSolver


4. **Kompilacja i uruchomienie**:
Aby skompilować i uruchomić grę, możesz użyć polecenia `javac`:

javac SudokuGame.java SudokuBoard.java InputHandler.java Main.java java Main


## Jak grać

1. Po uruchomieniu programu, na ekranie pojawi się początkowa plansza Sudoku.
2. Gra poprosi cię o wprowadzenie ruchu w formacie:
 ```
 Wiersz (1-9): <numer>
 Kolumna (1-9): <numer>
 Liczba (1-9): <numer>
 ```
3. Jeśli chcesz zakończyć grę i rozwiązać Sudoku, w dowolnym momencie wpisz:
 ```
 SUDOKU
 ```
4. Gra zakończy się, a program wyświetli rozwiązanie Sudoku oraz statystyki, takie jak liczba iteracji i zgadywań.

## Licencja

Projekt jest dostępny na licencji MIT. Możesz go używać, modyfikować i rozpowszechniać zgodnie z warunkami tej
