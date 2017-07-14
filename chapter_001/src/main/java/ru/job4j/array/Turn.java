package ru.job4j.array;
/**.
 * Класс Turn
 * @author Valeriy Gubskiy
 * @version 1.0
 * @since 14.07.2017
 */
public class Turn {
	/**.
	 * Метод зеркально переворачивает массив
	 * @param array - массив
	 * @return - возвращает перевернутый массив
	 */
	public int[] back(int[] array) {
		int length = array.length - 1;
		for (int i = 0; i <= length / 2; i++) {
			int a = array[i];
			array[i] = array[length - i];
			array[length - i] = a;
		}
		return array;
	}
}