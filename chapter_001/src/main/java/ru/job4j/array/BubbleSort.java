package ru.job4j.array;
/**.
 * Класс Turn
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 14.07.2017
 */
public class BubbleSort {
	/**.
	 * Метод сортировки массива пузырьком
	 * @param array - массив
	 * @return - возвращает отсортированный массив
	 */
	public int[] sort(int[] array) {
		int length = array.length;
		while (length != 0) {
			for (int i = 0; i < length - 1; i++) {
				int a = array[i];
				if (array[i] > array[i + 1]) {
					array[i] = array[i + 1];
					array[i + 1] = a;
				}
			}
			length--;
		}
		return array;
	}
}