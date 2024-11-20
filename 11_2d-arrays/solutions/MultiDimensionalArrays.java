package solutions;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        /* TODO Aufgabe 1: Deklariere und Initialisiere ein 2D-Array mit folgenden Werten
         *
         * 1  | 3  | 5  | 7
         * 2  | 4  | 6  | 8
         * 11 | 13 | 15 | 17
         * 12 | 14 | 16 | 18
         *
         */
        int[][] matrix = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {11, 13, 15, 17},
                {12, 14, 16, 18}
        };


        // TODO Aufgabe 2: Berechne mit einer foreach-Schleife die Summe der ersten Reihe
        int sum = 0;
        int[] firstRow = matrix[0];
        for (int number : firstRow) {
            sum += number;
        }
        System.out.println(sum);

        // TODO Aufgabe 3: Berechne mit einer foreach-Schleife die Summe der ersten Spalte
        sum = 0;
        for (int[] row : matrix) {
            // Erstes Element in dem Array
            sum += row[0];
        }
        System.out.println(sum);

        // TODO Aufgabe 4: Berechne mit zwei foreach-Schleifen die Summe aller Werte im 2D-Array
        sum = 0;
        for (int[] row : matrix) {
            for (int number : row) {
                sum += number;
            }
        }
        System.out.println(sum);

        // TODO Aufgabe 5: Berechne mithilfe einer for-Schleife die Summe der Diagonale von links-oben nach rechts-unten
        sum = 0;
        for (int index = 0; index < 4; index++) {
            sum += matrix[index][index];
        }
        System.out.println(sum);

        /* TODO: Bonusaufgabe 6: Vertausche im 2D-Array die erste Reihe mit der Letzten und überprüfe den Austausch
         *  durch die Ausgabe der Werte in der ersten Reihe des 2D-Arrays
         */
        int lastRowIndex = matrix.length - 1;
        int[] helperVariable = matrix[0];
        matrix[0] = matrix[lastRowIndex];
        matrix[lastRowIndex] = helperVariable;

        for (int number : matrix[0]) {
            System.out.print(number + " ");
        }
    }
}
