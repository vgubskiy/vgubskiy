package ru.job4j.array;
/**.
 * Класс поворота массива
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 17.07.2017
 */
public class RotateArray {
	/**.
	 * метод поворачивает двумерный массив
	 * на 90 градусов по часовй стрелке
	 * @param array - исходный массив
	 * @return - повернутый массив
	 */
	public int[][] rotate(int[][] array) {
        int row = array.length;
        int column = array[0].length;
        int[][] arr;
        if (row == column) {
            arr = new int[row][column];
        } else {
            arr = new int[column][row];
        }
        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {
                if (row == column) {
                    arr[j][column - 1 - i] = array[i][j];
                } else {
                    arr[j][row - 1 - i] = array[i][j];
				}
            }
        }
        return arr;
    }
}