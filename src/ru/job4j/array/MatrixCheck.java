package ru.job4j.array;

public class MatrixCheck {
    /**
     * Проверяем горизонталь в массиве
     * @param board
     * @param row
     * @return
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверяем вертикаль в массиве
     * @param board
     * @param column
     * @return
     */
     public static boolean monoVertical(char[][] board, int column) {
         boolean result = true;
         for (int index = 0; index < board.length; index++) {
           if (board[index][column] != 'X') {
               result = false;
              break;
           }
         }
     return result;
    }

    /**
     * Проверяем диагональ в массиве
     * @param board
     * @return rsl
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    /**
     * Проверяем массив на наличие вертикали или горизонтали
     * @param board
     * @return
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                if (monoHorizontal(board, index) || monoVertical(board, index)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}