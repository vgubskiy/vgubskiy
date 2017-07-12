package ru.job4j.max;

/**.
* Класс для определения максимального
* значения из трех целочисленных чисел
* @version 1.0
* @since 10.07.2017
* @author Valeriy Gubskiy
*/
public class Max {
	/**.
	* Метод возвращает максимальное значение из двух
	* @param first - первое целочисленное значение
	* @param second - второе целочисленное значение
	* @return - возвращет максимальное из двух
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**.
	* Метод возвращает максимальное значение из трех
	* @param first - первое целочисленное значение
	* @param second - второе целочисленное значение
	* @param third - второе целочисленное значение
	* @return - возвращет максимальное из трех
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}