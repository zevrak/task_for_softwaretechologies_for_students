package org.softwaretechnologies;

public final class ArrayFunctions {

    private ArrayFunctions() {
    }

    /**
     * Функция, меняющая порядок элементов в массиве array на обратный.
     * @param array массив, который будет перевернут.
     */
    public static void reverse(int[] array) {
        // TODO: реализуйте вышеуказанную функцию
        int t=array.length;
        for (int i = 0; i < t/ 2 ; i++) {
            int tmp = array[i];
            array[i] = array[t - 1 - i];
            array[t - 1 - i] = tmp;
        }
    }

    /**
     * Функция, заменяющая строки матрицы на столбцы матрицы. Пример:
       1  2  3     1  4  7
       4  5  6     2  5  8
       7  8  9     3  6  9
     * Функция работает только с квадратными матрицами.
     * Если матрица не квадратная, то выведете на экран сообщение:
       Матрица не квадратная
     * @param matrix матрица, в которой столбцы будут заменены на строки.
     */
    public static void rotateMatrix(int[][] matrix) {
        // TODO: реализуйте вышеуказанную функцию
        int matr=matrix.length;
        int m=matrix[0].length;
        if(matr!=m){
            System.out.println("Not a Square!");
    }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {

                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
}}}
